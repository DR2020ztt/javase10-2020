package com.neuedu.test.chapter10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Test6 {

	//35ѡ7
	//HashSet���λ����hash�㷨����(����Ҫ��������)
	//TreeSet�ڲ���������(��Ҫ��������)
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		TreeSet set=new TreeSet();
		
		while(set.size()<7)
		{
			//����1-35
			int num=r.nextInt(35)+1;
			set.add(num);
			
		}
		//��ӡ7����
		Iterator iter=set.iterator();
		while(iter.hasNext())
		{
			Object o=iter.next();
			System.out.println(o);
			
			//��������
		}
		//ð������
				
	}

}
