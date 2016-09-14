package com.atr.jd2tasks.spring.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Component("notifier")
public class Notifier {
    private static Logger log = Logger.getLogger(Notifier.class);

    public void beforeMethodPerform() {
	System.out.println("method beforeMethodPerform() works");
    }

    public void afterMethodPerform() {
	System.out.println("method afterMethodPerform() works");
    }

    public void aroundMethodPerform(ProceedingJoinPoint joinPoint) {
	try {
	    System.out.println("Method: " + joinPoint.getSignature() + " has started to work");
	    Object result = joinPoint.proceed();
	    System.out.println("Method: " + joinPoint.getSignature() + " has finished to work");
	    System.out.println("Result: " + result.toString());
	} catch (Throwable e) {
	    log.error("Error porforming aspect", e);
	}
    }
    public void afterMethodPerformProblems() {
	System.out.println("method afterMethodPerformProblems() works");
    }
    
    public void afterMethodWithArgsPerform(String name, Integer age) {
	System.out.println("method afterMethodWithArgsPerform(name, age) works: \n  name=" + name + "\n  age=" + age);
    }
}
