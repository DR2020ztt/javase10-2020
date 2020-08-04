package com.neuedu.test.chapter7;

public class AA extends Worker{
	
	double a;
	
	public AA()
	{
		super();
		System.out.println("aa");
	}
	
	public double getA()
	{
		return this.a;
	}
	
	public static void main(String[] args) {
		
		AA o=new AA();
		
	}

}
