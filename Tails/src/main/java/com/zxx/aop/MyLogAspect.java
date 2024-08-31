package com.zxx.aop;

import com.alibaba.fastjson.JSONObject;
import com.zxx.mapper.OperateLogMapper;
import com.zxx.pojo.OperateLog;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author 帅的被人砍
 * @create 2024-08-31 11:05
 */
@Component
@Aspect
@Slf4j
public class MyLogAspect {

    @Autowired
    private HttpServletRequest requet;

    @Autowired
    private OperateLogMapper operateLogMapper;

    @Around("@annotation(com.zxx.anno.MyLog)")
    public Object recordLog(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("---------------------------------------");
        System.out.println(requet);

//        操作类名
        String className = joinPoint.getTarget().getClass().getName();

//        操作方法名
        String methodName = joinPoint.getSignature().getName();
//        操作方法参数
        Object[] args = joinPoint.getArgs();
        String methodParams = Arrays.toString(args);
//        操作时间
        LocalDateTime operateTime=LocalDateTime.now();
        long begin = System.currentTimeMillis();
//        调用原始方法
        Object result = joinPoint.proceed();
//        操作结束时间
        long end =  System.currentTimeMillis();
//        方法返回值
        String returnValue = JSONObject.toJSONString(result);
//        操作耗时
        Long costTime=end - begin;
        operateLogMapper.insert(new OperateLog(null,1,operateTime,className,methodName,methodParams,returnValue,costTime));
        return result;
    }
}
