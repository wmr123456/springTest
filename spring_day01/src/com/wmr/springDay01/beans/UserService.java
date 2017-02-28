package com.wmr.springDay01.beans;

public class UserService {
	private UserDao dao;
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void add(){
		System.out.println("service add!");
		/*//service中得到UserDao的对象才能调用add方法
		UserDao dao = new UserDao();*/
		this.dao.add();
	}
}	
