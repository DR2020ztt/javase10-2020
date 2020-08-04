package com.neuedu.test.chapter7;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		
		s.setName("xx");
		s.setAge(20);
		s.setSex("Å®");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getSex());
		
		
		Student s2=new Student("yy",30,"ÄÐ");
		
		s2.setName("zz");
		s2.setAge(25);
		s2.setSex("ÄÐ");
		
		
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getSex());
		
	}

}
