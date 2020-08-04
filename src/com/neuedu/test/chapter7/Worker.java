package com.neuedu.test.chapter7;

public class Worker extends Employee{
	
	double dressAllowance;
	
	public Worker()
	{
		System.out.println("worker");
	}

	public double getDressAllowance()
	{
		return this.dressAllowance;
	}
	
	public static void main(String[] args) {
		
		//创建一个worker的对象
		Worker o=new Worker();
		o.name="xaio hong";
		o.age=18;
		o.department="research";
		o.dressAllowance=200;
		
		//o.work();
		o.getDressAllowance();
	}

}
