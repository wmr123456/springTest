package com.wmr.springDay03.c3p0;

public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(){
		System.out.println("service add!");
		userDao.add();
	}
}
