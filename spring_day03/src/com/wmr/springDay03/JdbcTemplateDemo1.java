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
	//添加操作
	@Test
	public void add(){
		//设置数据库信息
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		//创建jdbcTemplate对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//调用jdbcTemplate对象里面的方法
		//创建生气了语句
		String sql = "INSERT INTO user values(?,?)";
		int i = jdbcTemplate.update(sql, "aaa","a1");//返回值为修改记录的条数
		System.out.println(i);
	}
	
	//修改操作
	public void update(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		//创建jdbcTemplate对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//调用jdbcTemplate对象里面的方法
		//创建生气了语句
		String sql = "UPDATE user set password=? where username=?";
		int i = jdbcTemplate.update(sql, "a2","aaa");//返回值为修改记录的条数
		System.out.println(i);
	}
	
	//删除操作
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
	
	//查询操作，返回摸一个值
	@Test
	public void select1(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select count(*) from user";
		//调用jdbcTemplate的方法
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}
	
	//返回对象
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
	
	//查询返回集合
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
		//从结果集中得到数据
		String username = rs.getString("username");
		String password = rs.getString("password");
		//将得到的数据封装到对象里面
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}
	
}
