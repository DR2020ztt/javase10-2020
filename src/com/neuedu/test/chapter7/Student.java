package com.neuedu.test.chapter7;

public class Student {

	private String name;
	private int age;
	private String sex;
	
	public Student()
	{
		
	}
	public Student(String name,int age,String sex)
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0&&age<=200)
		{
			this.age = age;
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public static void main(String[] args) {
		Student s=new Student();
		
	}
	
	
	
	
}
