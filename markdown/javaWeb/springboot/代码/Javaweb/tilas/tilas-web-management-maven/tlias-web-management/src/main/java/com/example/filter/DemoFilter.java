package com.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

//@WebFilter(urlPatterns = "/*")// /* 表示拦截所有请求
public class DemoFilter implements Filter {

    @Override//初始化的方法只调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
        System.out.println("init 初始化方法执行了");
    }

    @Override//拦截到请求后调用，会调用多次
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Demo 拦截到请求......放行前的逻辑");
        //放行，调用下一个过滤器，如果没有过滤器，则调用目标资源
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("Demo 拦截到请求.......放行后的逻辑");
    }

    @Override//销毁方法，只调用一次
    public void destroy() {
//        Filter.super.destroy();
        System.out.println("destroy 销毁方法执行了");
    }
}
