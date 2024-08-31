package com.zxx.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 帅的被人砍
 * @create 2024-08-30 19:23
 */
@Slf4j
@Component
@Aspect
public class TimeAspect {
    @Around("execution(* com.zxx.service.*.*(..))")
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        //1．记录开始时间
        long begin = System.currentTimeMillis() ;
        //2.调用原始方法运行
        Object result = joinPoint.proceed();
        //3.记录结束时间，计算方法执行耗时
        long end = System.currentTimeMillis() ;
        log.info(joinPoint.getSignature()+"方法执行耗时：{}ms",end-begin);
        return result;
    }
}
