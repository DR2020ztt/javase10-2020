package com.neuedu.test.chapter8;

public class TestException4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ma());
	}

	public static int ma()
	{
		int b=10;
		try
		{
			int n=100;
			return n/b;
			
		}
		catch(Exception e)
		{
			return 10;

		} 
		finally 
		{
			return 100;
		}
	}
}
