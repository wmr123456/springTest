package com.wmr.springDay02;

import javax.annotation.Resource;

public class BookService {
	//得到bookDao和orderDao的队形
	@Resource(name="bookDao")
	private BookDao bookDao;
	@Resource(name="orderDao")
	private OrderDao orderDao;
	public void add(){
		System.out.println("service running!");
		bookDao.bookDao();
		orderDao.buy();
	}
}
