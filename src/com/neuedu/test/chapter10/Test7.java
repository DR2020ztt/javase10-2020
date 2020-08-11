package com.neuedu.test.chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//泛型
		//ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list=new ArrayList<>();
		
		list.add("x");
		list.add("y");
		
		ArrayList<Integer> list2=new ArrayList<>();
		
		//不需要强制类型转换
		for(String str:list)
		{
			System.out.println(str);
		}
		Iterator<String> iter=list.iterator();
		while(iter.hasNext())
		{
			String str=iter.next();
			System.out.println(str);
		}
	}

}
