package com.neuedu.test.chapter7;

public class Employee {
	
	String name;
	int age;
	String department;
	
	public Employee()
	{
		System.out.println("创建了父类");
	}
	
	public Employee(String name,int age,String department)
	{
		this.name=name;
		this.age=age;
		this.department=department;
	}
	
	
	public void getDetail()
	{
		System.out.println(
				this.name+","+this.age+","+this.department);
	}

}
