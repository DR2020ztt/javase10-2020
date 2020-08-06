package com.neuedu.test.chapter7.copy;

public class TestFinal {

	/*
	 * 属性有默认值
	 * final的属性没有默认值
	 * 两个时机赋初值：1）声明属性 2）构造方法
	 */
	final String name;
	
	public TestFinal(String name)
	{
		this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int a/*=100*/;
		
		a=100;
		
		System.out.println(a);
	}

}
