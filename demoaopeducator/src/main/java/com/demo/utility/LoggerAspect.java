package com.demo.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {

	private Log LOGGER=LogFactory.getLog(LoggerAspect.class);
	
	@Before("execution(public * com.demo.*.*.display(..))")
	public void beforeMethod() {
	 LOGGER.info("Before the method in controller/service is called");	
	}
	
	@After("execution(public * com.demo.*.*.display(..))")
	public void afterMethod() {
	 LOGGER.info("After the method in controller/service is called");	
	}
	
	@AfterReturning(pointcut="execution(* com.demo.*.*.display(..))",returning = "returnvalue")
	public void afterReturning(int returnvalue)  {
		LOGGER.info("After returning advice called."+returnvalue);
	}

	@AfterThrowing(pointcut = "execution(* com.demo.controller.*Controller.*(..))", throwing = "exception")
	public void afterThrowing(Exception exception) throws Exception {
		LOGGER.error(exception.getMessage(), exception);
	}
}
