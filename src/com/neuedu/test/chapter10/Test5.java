package com.neuedu.test.chapter10;

import java.util.HashSet;
import java.util.Iterator;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//存储数据是按照哈西算法存放的
		
		//去重
		//"无序"
		HashSet s=new HashSet();
		s.add("jack");
		s.add("jack");
		s.add("tom");
		s.add("lucy");
		s.add("abc");
		
		//HashSet没有下标
		for(Object o:s)
		{
			System.out.println(o);
			
		}
			
		System.out.println("===========");
		
		Iterator iter=s.iterator();
		while(iter.hasNext())
		{
			Object o=iter.next();
			System.out.println(o);
			
		}
	}

}
