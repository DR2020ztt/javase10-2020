package com.neuedu.test.chapter10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Test6 {

	//35选7
	//HashSet存放位置由hash算法决定(不需要排序用它)
	//TreeSet内部是排序树(需要排序用它)
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		TreeSet set=new TreeSet();
		
		while(set.size()<7)
		{
			//生成1-35
			int num=r.nextInt(35)+1;
			set.add(num);
			
		}
		//打印7个数
		Iterator iter=set.iterator();
		while(iter.hasNext())
		{
			Object o=iter.next();
			System.out.println(o);
			
			//放数组里
		}
		//冒泡排序
				
	}

}
