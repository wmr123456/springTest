package com.wmr.springDay02.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {
	public void myBook(){
		System.out.println("myBook..........Test");
	}
	
	//�ڷ���������������ǿ��ע��
		@Before(value="execution(* com.wmr.springDay02.aop.annotation.Book.*(..))")
	public void before1(){
		System.out.println("bofore1 ........add");
	}
}
