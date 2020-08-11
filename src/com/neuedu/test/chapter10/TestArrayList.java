package com.neuedu.test.chapter10;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//变长
		//饮用数据类型
		//List放重复的
		ArrayList list=new ArrayList();
		list.add("AA");
		list.add("BB");
		list.add("AA");
		
		System.out.println(list.get(0));//AA
		System.out.println(list.get(1));//BB
		System.out.println(list.get(2));//AA
		
		System.out.println(list.size());//得到集合的长度
		
		for(int i=0;i<list.size();i++)
		{
			Object o=list.get(i);
		
			//String str=(String)o;
			System.out.println(o);
		}
		
		Integer a=10;//自动装箱  基本数据类型->引用数据类型
		
		int b=a;//自动拆箱  包装类->基本数据类型
		
		ArrayList list2=new ArrayList();
		list2.add(1);//自动装箱
		list2.add(2);
		list2.add(3);
		
		for(int i=0;i<list2.size();i++)
		{
			Object o=list2.get(i);
			System.out.println(o);
		}
	}

}
