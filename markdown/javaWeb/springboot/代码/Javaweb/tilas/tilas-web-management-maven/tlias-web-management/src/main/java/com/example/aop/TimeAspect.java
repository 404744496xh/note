package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Component
//@Aspect()//AOP类
public class TimeAspect {

    //切点
    //@Around("execution(* com.example.service.*.*(..))")
    @Around("com.example.aop.MyAspect.pt()")
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        //1.记录开始时间
        long begin = System.currentTimeMillis();

        //2.调用原始方法运行
        Object result = joinPoint.proceed();

        //3.记录结束时间，计算方法执行耗时
        long end = System.currentTimeMillis();
        log.info("执行了 {} 方法，耗时：{} 毫秒", joinPoint.getSignature().getName(), end - begin);

        return result;
    }
}
