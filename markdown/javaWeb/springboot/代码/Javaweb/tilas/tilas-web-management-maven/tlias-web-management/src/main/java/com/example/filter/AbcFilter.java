package com.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

//@WebFilter(urlPatterns = "/*")//多个过滤器的顺序是按照类名的字母顺序进行排序的
public class AbcFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("abc拦截到请求......放行前的逻辑");
        //放行，调用下一个过滤器，如果没有过滤器，则调用目标资源
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("abc拦截到请求.......放行后的逻辑");
    }
}
