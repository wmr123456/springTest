package com.wmr.springDay01.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person2 {
	private String[] argss;
	private List<String> lit;
	private Map<String,String> map;
	private Properties props;
	public void setArgss(String[] argss) {
		this.argss = argss;
	}
	public void setLit(List<String> lit) {
		this.lit = lit;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	public void testPersion2(){
		int lenghta = argss.length;
		for(int i=0 ; i < lenghta; i++){
			System.out.println(argss[i]);
		}
		
		int lengthl = lit.size();
		for(int i = 0; i < lengthl; i++){
			System.out.println(lit.get(i));
		}
		System.out.println(map);
		System.out.println(props);
	}
}
