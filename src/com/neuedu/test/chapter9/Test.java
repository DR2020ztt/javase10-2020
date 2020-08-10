package com.neuedu.test.chapter9;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建2个student对象
		Student s1=new Student("XX",10);
		Student s2=new Student("YY",20);
		
		System.out.println(s1);//默认调用了s1.toString()
		System.out.println(s2);
		
		//默认Object的equals比较的是2个对象的内存地址
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
	
	
		//打印s1,s2的哈希码
		/*
		 * 哈希码：哈希码不同，对象一定不同
		 *       哈希码相同，对象可能相同，可能不同
		 * 哈希码不是对象的唯一标识
		 */
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	
	
	}

}

class Student
{
	private String name;
	private int age;
	
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}


	@Override
	public boolean equals(Object obj) {
		
		Student s2=(Student)obj;
		
		if(this.name.equals(s2.name) && this.age==s2.age)
		{
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		return this.name+","+this.age;
	}	
	
	
}

class Employee
{
	private String name;
	private String depatrment;
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e2=(Employee)obj;
		if(this.name.equals(e2.name) && this.depatrment.equals(e2.depatrment))
		{
			return true;
		}
		return false;
	}
	
}









