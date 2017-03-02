package com.wmr.springDay03.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

public class TxTest {
	@Test
	public void txDemo(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AcountService acountService = (AcountService) context.getBean("acountService");
		acountService.acountMoney();
	}
	
	@Test
	public void txAnoDemo(){
		ApplicationContext context = new ClassPathXmlApplicationContext("txann.xml");
		AcountService acountService = (AcountService) context.getBean("acountService");
		acountService.acountMoney();
	}
}
