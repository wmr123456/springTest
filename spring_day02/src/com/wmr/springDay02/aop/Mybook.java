package com.wmr.springDay02.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Mybook {
	public void before1(){
		System.out.println("前置增强,before！");
	}
	
	public void after1(){
		System.out.println("后置执行。。。。。。after!");
	}
	
	//环绕执行
	public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		//方法前
		System.out.println("方法前执行。。。。。。环绕");
		
		//被增强的方法执行
		proceedingJoinPoint.proceed();
		
		//方法后	
		System.out.println("方法后执行。。。。。。环绕");
	}
}
