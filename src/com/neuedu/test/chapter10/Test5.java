package com.neuedu.test.chapter10;

import java.util.HashSet;
import java.util.Iterator;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�洢�����ǰ��չ����㷨��ŵ�
		
		//ȥ��
		//"����"
		HashSet s=new HashSet();
		s.add("jack");
		s.add("jack");
		s.add("tom");
		s.add("lucy");
		s.add("abc");
		
		//HashSetû���±�
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
