package com.library.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {

	private static final Log LOGGER=LogFactory.getLog(LoggerAspect.class);
	
	@Before("execution(public int com.library.service.BookService.addBooks(..))")
	//@Before("execution(int com.library.service.BookService.addBooks(..))")
	//@Before("execution(* com.library.service.BookService.addBooks(..))")
	// beforeMethodCall is one of the advice and which is before advice
	public void beforeMethodCall(JoinPoint jp) {
		LOGGER.info("Going to call the add method   "+jp.getSignature());
	}
	
	@After("execution(public int com.library.service.BookService.addBooks(..))")
	// @After will execute irrespective of exception which with or without
	// exception it will execute
	public void afterMethodCall(JoinPoint jp) {
		LOGGER.info("Method got called    "+jp.getSignature());
	}
	
	// After returning wont execute if we have exception
	@AfterReturning(pointcut="execution(* com.library.service.*Service.*(..))",returning = "returnvalue")
	public void afterReturning(int returnvalue)  {
		LOGGER.info("After returning The value is .    "+returnvalue);
	}

	@AfterThrowing(pointcut = "execution(* com.library.service.BookService.*(..))", throwing = "exception")
	public void afterThrowing(Exception exception) throws Exception {
		LOGGER.error(exception.getMessage(), exception);
	}
	
}
