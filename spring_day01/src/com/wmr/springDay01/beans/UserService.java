package com.wmr.springDay01.beans;

public class UserService {
	private UserDao dao;
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void add(){
		System.out.println("service add!");
		/*//service�еõ�UserDao�Ķ�����ܵ���add����
		UserDao dao = new UserDao();*/
		this.dao.add();
	}
}	
