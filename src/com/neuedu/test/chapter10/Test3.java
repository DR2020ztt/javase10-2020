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
		while(iter.hasNext())//iter.hasNext()看下一个有没有值
		{
			Object o=iter.next();//游标走过的那个值给o
			Stu s=(Stu)o;//向下转型
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
	//构造方法
	public Stu(String name,double score)
	{
		this.name=name;
		this.score=score;
	}
}