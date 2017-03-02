package com.wmr.springDay03.tx;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AcountService {
	private AcountDao acountDao;

	public void setAcountDao(AcountDao acountDao) {
		this.acountDao = acountDao;
	}
	
	//转账操作l
	public void acountMoney(){
		//aaa少1000
		acountDao.lessMoney();
		//bbb多1000
		acountDao.moreMoney();
	}
	
}
