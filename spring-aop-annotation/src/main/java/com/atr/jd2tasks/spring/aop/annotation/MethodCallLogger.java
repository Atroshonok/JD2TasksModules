package com.atr.jd2tasks.spring.aop.annotation;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("methodCallLogger")
public class MethodCallLogger {
    private static Logger log = Logger.getLogger(MethodCallLogger.class);
    
    @Pointcut("execution(* com.atr.jd2tasks.spring.aop.annotation.UserService.changeUserProperties(..))")
    public void perform() {
    }
    
    @Around("perform()")
    public void logMethodCall(ProceedingJoinPoint joinPoint) {
	try {
	    System.out.println("Starting of method: " + joinPoint.getSignature());
	    joinPoint.proceed();
	    System.out.println("Starting of method: " + joinPoint.getSignature());
	} catch (Throwable e) {
	    log.error("Error occured durring performing method: " + joinPoint.getSignature(), e);
	}
	
    }
    

}
