package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * 切面类的顺序默认根据名称排序
 */
//通过order来设置
//目标方法前的通知方法:数字小的先执行
//目标方法后的通知方法:数字小的后执行
@Order(1)
@Slf4j
@Component
//@Aspect()//AOP类
public class MyAspect {

    //定义切点
//    @Pointcut("execution(* com.example.service.impl.DeptServiceImpl.*(..))")
//    切入点表达式execution(访问修饰符? 返回值 包名.类名.?方法名(方法参数) throws 异常?)//？表示可以省略
//   @Pointcut("execution(public void com.example.service.DeptService.delete(java.lang.Integer))")
//    @Pointcut("execution(void com.example.service.DeptService.delete(java.lang.Integer))")
    @Pointcut("execution(void delete(java.lang.Integer))")//包名类名不建议省略
    public void pt(){}

    //针对list方法、delete方法进行前置通知和后置通知
   //基于注解的方式来匹配切入点方法。
    @Pointcut("@annotation(com.example.anno.MyLog)")
    public void pt2(){}

    @Before("pt()")
    public void before(){
        log.info("before.....");
    }


    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        log.info("around before.....");

        //调用目标对象的原始方法
        Object result = proceedingJoinPoint.proceed();

        log.info("around after.....");

        return result;
    }

    @After("pt()")
    public void after(){
        log.info("after.....");
    }

    @AfterReturning("pt()")
    public void afterReturning(){
        log.info("after return.....");
    }

    @AfterThrowing("pt()")
    public void afterThrowing(){
        log.info("after throwing.....");
    }
}
