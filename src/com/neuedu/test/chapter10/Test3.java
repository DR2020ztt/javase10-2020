package com.neuedu.test.chapter10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList();
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			String line=sc.nextLine();
			if(line.equals("exit"))
			{
				break;
			}
			else
			{
				String[] arr=line.split(",");
				if(arr.length==2)
				{
					String name=arr[0];
					String score=arr[1];
					
					Stu s=new Stu(name,Double.parseDouble(score));
					list.add(s);
				}
			}

		}
		double sum=0;
		Iterator iter=list.iterator();
		while(iter.hasNext())//iter.hasNext()����һ����û��ֵ
		{
			Object o=iter.next();//�α��߹����Ǹ�ֵ��o
			Stu s=(Stu)o;//����ת��
			sum+=s.score;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		}
		double avg=sum/list.size();
		System.out.println(avg);
		
	}

}

class Stu
{
	String name;
	double score;
	//���췽��
	public Stu(String name,double score)
	{
		this.name=name;
		this.score=score;
	}
}