package com.wmr.springDay03.tx;

import org.springframework.jdbc.core.JdbcTemplate;

//对数据库操作
public class AcountDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//少钱的方法
	public void lessMoney(){
		String sql = "update acount set salary=salary+? where username=?";
		jdbcTemplate.update(sql, -1000, "aaa");
	}
	
	//加钱的方法
	public void moreMoney(){
		String sql = "update acount set salary=salary+? where username=?";
		jdbcTemplate.update(sql, 1000, "bbb");
	}
}
