package com.wmr.springDay02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestDay02 {
	//ע�ⷽʽ���󴴽�����
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u = (User) context.getBean("user");
		u.add();
	}
	//ע�ⷽʽ����ע�����
	@Test
	public void testService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService) context.getBean("userService");
		service.add();
	}
	//�����ļ���ע�ⷽʽ���ʹ�ò���
	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService service = (BookService)context.getBean("bookService");
		service.add();
	}
}
