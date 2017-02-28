package com.wmr.springDay01.beans;

public class Person {
	private String pname;

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void add(){
		System.out.println(this.pname);
	}
}
