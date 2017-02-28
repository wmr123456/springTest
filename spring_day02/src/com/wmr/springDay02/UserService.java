package com.wmr.springDay02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="userService")
public class UserService {
	//得到对象
	//使用注解不需要set方法
	//在属性上添加注解@Autowired
	/*@Autowired
	private UserDao userDao;*/
	@Resource(name="dao")
	private UserDao userDao;
	
	public void add(){
		System.out.println("add Service!");
		userDao.add();
	}
}
