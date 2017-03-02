package com.wmr.springDay03.c3p0;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//Ìí¼Ó²Ù×÷
	public void add(){
		String sql = "insert into user values(?,?)";
		int rows = jdbcTemplate.update(sql, "ddd","d1");
		System.out.println(rows);
	}
}
