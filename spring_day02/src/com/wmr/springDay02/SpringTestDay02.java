package com.wmr.springDay02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestDay02 {
	//注解方式对象创建测试
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u = (User) context.getBean("user");
		u.add();
	}
	//注解方式属性注入测试
	@Test
	public void testService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService) context.getBean("userService");
		service.add();
	}
	//配置文件和注解方式混合使用测试
	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService service = (BookService)context.getBean("bookService");
		service.add();
	}
}
