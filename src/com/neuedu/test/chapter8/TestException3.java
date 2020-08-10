package com.neuedu.test.chapter8;

public class TestException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * finally是必须执行的代码
 * 就算catch中有return，也必须执行完finally的代码，才能退出
 * 
 * try-catch
 * try-catch-finally
 * try-finally
 */
		int b=0;
		try
		{
			int a=10;
			b=0;
			int c=a/b;
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			return;
		}
		finally
		{
			System.out.println(b);
		}
		System.out.println("XX");
	}

}
