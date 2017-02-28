package com.wmr.springDay01;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wmr.springDay01.beans.Bean2;
import com.wmr.springDay01.beans.Person;
import com.wmr.springDay01.beans.Person2;
import com.wmr.springDay01.beans.ProptitiesTest;
import com.wmr.springDay01.beans.ProptitiesTest2;
import com.wmr.springDay01.beans.UserService;

public class SpringIocTest {
	@Test
	public void test() {
		//加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//创建对象实例
		User user = (User) context.getBean("user");
		/*User user2 = (User) context.getBean("bean2");*/
		System.out.println(user);
		/*System.out.println(user2);*/
		user.add();
	}
	
	@Test
	public void bea2Test() {
		//加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//创建对象实例
		((Bean2)context.getBean("bean2")).add();
	}
	
	@Test
	public void prop1Test() {
		//加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//创建对象实例
		ProptitiesTest prop1 = (ProptitiesTest)context.getBean("prop1");
		prop1.getname();
	}
	
	@Test
	public void prop2Test() {
		//加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//创建对象实例
		ProptitiesTest2 prop2 = (ProptitiesTest2)context.getBean("prop2");
		prop2.sysname();
	}
	

	@Test
	public void serviceTest() {
		//加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//创建对象实例
		UserService service = (UserService)context.getBean("userService");
		service.add();
	}
	
	@Test
	public void pTest() {
		//加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//创建对象实例
		Person person = (Person)context.getBean("p");
		person.add();
	}
	
	@Test
	public void p2Test() {
		//加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//创建对象实例
		Person2 person2 = (Person2)context.getBean("p2");
		person2.testPersion2();
	}
}
