package com.wmr.springDay03.tx;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AcountService {
	private AcountDao acountDao;

	public void setAcountDao(AcountDao acountDao) {
		this.acountDao = acountDao;
	}
	
	//ת�˲���l
	public void acountMoney(){
		//aaa��1000
		acountDao.lessMoney();
		//bbb��1000
		acountDao.moreMoney();
	}
	
}
