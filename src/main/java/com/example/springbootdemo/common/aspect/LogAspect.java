package com.example.springbootdemo.common.aspect;

import com.example.springbootdemo.service.system.ISysOperLogService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Autowired
    private ISysOperLogService sysOperLogService;

    @Pointcut("@annotation(com.example.springbootdemo.common.aspect.Log)")
    public void logPoinCut(){

    }
}
