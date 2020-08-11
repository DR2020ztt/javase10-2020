package com.neuedu.test.chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a=new ArrayList();
		a.add("s1");
		a.add("s2");
		
		ArrayList b=new ArrayList();
		a.add("c");
		a.add("d");
		b.addAll(a);
		//b.add(a);//3
		System.out.println(b.contains("s1"));
		
		
		//b.clear();//0 都没有了
		System.out.println(b.size());//4
		
		Student s1=new Student("s1",18);
		ArrayList c=new ArrayList();
		c.add(new Student("s1",18));
		c.add(new Student("s2",19));
		c.add(new Student("s3",20));
		
		System.out.println(c.indexOf(s1));
		//System.out.println(c.contains(s1));
		//System.out.println(c.contains(new Student("s1",18)));
	
		/*for(int i=0;i<c.size();i++)
		{
			Object o=c.get(i);
			Student s=(Student)o;
		}
*/		
		/*for(Object o:c)
		{
			Student s=(Student)o;
		}*/
		
		//迭代器
		Iterator iter=c.iterator();
	
		while(iter.hasNext())
		{
			Object o=iter.next();
			Student s=(Student)o;
			System.out.println(s.name+","+s.age);
			
		}
	
	}

}

class Student
{
	String name;
	int age;
	
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	
}