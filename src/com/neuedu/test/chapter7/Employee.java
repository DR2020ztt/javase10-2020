package com.neuedu.test.chapter7;

public class Employee {
	
	String name;
	int age;
	String department;
	
	public Employee()
	{
		System.out.println("�����˸���");
	}
	
	public Employee(String name,int age,String department)
	{
		this.name=name;
		this.age=age;
		this.department=department;
	}
	
	
	public void work()
	{
		System.out.println("worker");
	}

}
