package com.wmr.springDay03.tx;

import org.springframework.jdbc.core.JdbcTemplate;

//�����ݿ����
public class AcountDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//��Ǯ�ķ���
	public void lessMoney(){
		String sql = "update acount set salary=salary+? where username=?";
		jdbcTemplate.update(sql, -1000, "aaa");
	}
	
	//��Ǯ�ķ���
	public void moreMoney(){
		String sql = "update acount set salary=salary+? where username=?";
		jdbcTemplate.update(sql, 1000, "bbb");
	}
}
