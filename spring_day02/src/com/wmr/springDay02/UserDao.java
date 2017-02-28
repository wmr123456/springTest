package com.wmr.springDay02;

import org.springframework.stereotype.Component;

@Component(value="dao")
public class UserDao {
	public void add(){
		System.out.println("add Dao!");
	}
}
