package com.wmr.springDay02.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Mybook {
	public void before1(){
		System.out.println("ǰ����ǿ,before��");
	}
	
	public void after1(){
		System.out.println("����ִ�С�����������after!");
	}
	
	//����ִ��
	public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		//����ǰ
		System.out.println("����ǰִ�С���������������");
		
		//����ǿ�ķ���ִ��
		proceedingJoinPoint.proceed();
		
		//������	
		System.out.println("������ִ�С���������������");
	}
}
