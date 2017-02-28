package com.wmr.springDay02;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="user")
@Scope(value="prototype")
public class User {
	public void add(){
		System.out.println("add..............spring day02 ×¢½â·½Ê½£¡");
	}
}
