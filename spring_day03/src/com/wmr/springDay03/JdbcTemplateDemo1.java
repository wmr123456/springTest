package com.wmr.springDay03;

import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcTemplateDemo1 {
	//��Ӳ���
	@Test
	public void add(){
		//�������ݿ���Ϣ
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		//����jdbcTemplate������������Դ
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//����jdbcTemplate��������ķ���
		//�������������
		String sql = "INSERT INTO user values(?,?)";
		int i = jdbcTemplate.update(sql, "aaa","a1");//����ֵΪ�޸ļ�¼������
		System.out.println(i);
	}
	
	//�޸Ĳ���
	public void update(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		//����jdbcTemplate������������Դ
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//����jdbcTemplate��������ķ���
		//�������������
		String sql = "UPDATE user set password=? where username=?";
		int i = jdbcTemplate.update(sql, "a2","aaa");//����ֵΪ�޸ļ�¼������
		System.out.println(i);
	}
	
	//ɾ������
	@Test
	public void delete(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "delete from user where username=?";
		int i = jdbcTemplate.update(sql, "aaa");
		System.out.println(i);
	}
	
	//��ѯ������������һ��ֵ
	@Test
	public void select1(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select count(*) from user";
		//����jdbcTemplate�ķ���
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}
	
	//���ض���
	@Test
	public void selectObject(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select * from user where username=?";
		//
		User user = jdbcTemplate.queryForObject(sql, new MYRowMapper(), "aaa");
		System.out.println(user);
	}
	
	//��ѯ���ؼ���
	public void selectList(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select * from user";
		List<User> uList = jdbcTemplate.query(sql, new MYRowMapper());
		for(int i = 0 ;i<uList.size();i++){
			System.out.println(uList.get(i));
		}
	}
	public static void main(String[] args) {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select * from user";
		List<User> uList = jdbcTemplate.query(sql, new MYRowMapper());
		for(int i = 0 ;i<uList.size();i++){
			System.out.println(uList.get(i));
		}
	}
	
	@Test
	public void test() throws PropertyVetoException{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql:///test");
		dataSource.setUser("root");
		dataSource.setPassword("root");
	}
}

class MYRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int num) throws SQLException {
		//�ӽ�����еõ�����
		String username = rs.getString("username");
		String password = rs.getString("password");
		//���õ������ݷ�װ����������
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}
	
}
