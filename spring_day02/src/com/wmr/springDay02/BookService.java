package com.wmr.springDay02;

import javax.annotation.Resource;

public class BookService {
	//�õ�bookDao��orderDao�Ķ���
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
