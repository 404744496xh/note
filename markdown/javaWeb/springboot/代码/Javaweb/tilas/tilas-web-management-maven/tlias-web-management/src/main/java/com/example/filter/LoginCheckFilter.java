package com.example.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pojo.Result;
import com.example.utills.JwtUtils;
import com.github.pagehelper.util.StringUtil;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.util.StringUtils;

import java.io.IOException;


@Slf4j
//@WebFilter(urlPatterns = "/*")
public class LoginCheckFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest rep = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        //1.获取请求的url
        String url = rep.getRequestURI();
        log.info("请求的url:{}",url);

        //2.判断请求的url中是否包含login，如果包含，则说明用户要进行登陆，放行
        if(url.contains("login")){
            log.info("登陆操作，放行");
            chain.doFilter(rep,resp);
            return ;
        }

        //3.获取请求头中的令牌（token）
        String jwt = rep.getHeader("token");
        log.info("请求头中的令牌:{}",jwt);

        //4.判断令牌是否存在，如果不存在，就返回错误结果（未登录）
        if(!StringUtils.hasLength(jwt)){
            log.info("请求头token为空，返回未登录信息");
            Result error = Result.error("NOT_LOGIN");
            //手动转换json  --------->  阿里巴巴fastjson
            String notLogin = JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return;
        }

        //5.解析token，如果解析失败，就返回错误结果（未登录）
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {//解析失败
            e.printStackTrace();
            log.info("解析token失败，返回未登录信息");
            Result error = Result.error("NOT_LOGIN");
            //手动转换json  --------->  阿里巴巴fastjson
            String notLogin = JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return;
        }

        //6.放行
        log.info("令牌合法，放行");
        chain.doFilter(rep,resp);
    }
}
