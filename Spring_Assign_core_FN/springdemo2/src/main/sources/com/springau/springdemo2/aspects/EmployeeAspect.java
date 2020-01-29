package com.springau.springdemo2.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
	
	@Before("execution(* com.springau.springdemo2.services.EmployeeManager.getEmployeeById(..))")
	public void logBeforeV1(JoinPoint joinPoint) {
		System.out.println("EmployeeAspect.logBeforeV1 :"+joinPoint.getSignature().getName());
	}
	
	@Before("execution(* com.springau.springdemo2.services.EmployeeManager.getALLEmployee(..))")
	public void logBeforeV2(JoinPoint joinPoint) {
		System.out.println("EmployeeAspect.logBeforeV1 :"+joinPoint.getSignature().getName()+java.time.LocalTime.now());
	}
	
	@After("execution(* com.springau.springdemo2.services.EmployeeManager.getALLEmployee(..))")
	public void logAfterV2(JoinPoint joinPoint) {
		System.out.println("EmployeeAspect.logAfterV1 :"+joinPoint.getSignature().getName()+java.time.LocalTime.now());
	}
}
