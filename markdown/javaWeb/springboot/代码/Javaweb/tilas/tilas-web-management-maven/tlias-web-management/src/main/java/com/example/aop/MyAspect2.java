package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
连接点
 */
@Slf4j
//@Aspect
@Component
public class MyAspect2 {

    @Pointcut("execution(* com.example.service.impl.DeptServiceImpl.*(..))")
    public void pt(){}

    @Before("pt()")
    public void before(JoinPoint joinPoint){
        log.info("MyAspect2.......before......");
        //1.获取目标对象类名
        String className = joinPoint.getTarget().getClass().getName();
        log.info("before 目标对象类名：{}",className);

        //2.获取 目标对象方法名
        String methedName = joinPoint.getSignature().getName();
        log.info("before 目标对象方法名：{}",methedName);

        //3.获取 目标对象方法参数
        Object[] args = joinPoint.getArgs();
        log.info("before 目标对象方法参数：{}",args);
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint joinPoint)throws Throwable {
        log.info("MyAspect2.......around before......");

        //1.获取目标对象类名
        String className = joinPoint.getTarget().getClass().getName();
        log.info("目标对象类名：{}",className);

        //2.获取 目标对象方法名
        String methodName = joinPoint.getSignature().getName();
        log.info("目标对象方法名：{}",methodName);

        //3.获取 目标对象方法参数
        Object[] args = joinPoint.getArgs();
        log.info("目标对象方法参数：{}",args);

        //4.放行 目标方法执行
        Object result = joinPoint.proceed();


        //5.获取 目标方法返回值
        log.info("目标对象方法执行结果：{}",result);

        log.info("MyAspect2.......around after......");

        return null;
    }
}
