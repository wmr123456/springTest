package com.wmr.springDay02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="userService")
public class UserService {
	//�õ�����
	//ʹ��ע�ⲻ��Ҫset����
	//�����������ע��@Autowired
	/*@Autowired
	private UserDao userDao;*/
	@Resource(name="dao")
	private UserDao userDao;
	
	public void add(){
		System.out.println("add Service!");
		userDao.add();
	}
}
