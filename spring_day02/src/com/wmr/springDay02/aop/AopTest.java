package com.wmr.springDay02.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
	@Test
	public void testAop(){
		ApplicationContext context = new ClassPathXmlApplicationContext("\\applicationContext.xml");
		Book book = (Book)context.getBean("book");
		book.add();
	}
	
	@Test
	public void testAop1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("\\applicationContext.xml");
		Book book = (Book)context.getBean("book");
		book.add();
	}
	
}
