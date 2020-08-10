package com.neuedu.test.chapter8;

/*
 * throw与throws区别
 * throw是指手动抛出异常->抛到指定的方法中
 * throws是指向上抛出，向调用此方法的方法抛去（main方法）
 */
public class TestException7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean flag = isZhiShu(13);
		
		//System.out.println(flag);
		
		try {
			zhiShu(9);
			
			System.out.println("质数");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("不是质数");
		}

	}
	
	public static boolean isZhiShu(int n)
	{
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void zhiShu(int n) throws Exception
	{
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
			{
				throw new Exception();
			}
		}
	}

}
