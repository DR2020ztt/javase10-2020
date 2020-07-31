package com.neuedu.test.chapter5;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//递归
		//自己调用自己，递归调用
		//5的阶乘
		int num=fn(5);
		System.out.println(num);
		int num2=feibonaqie(6);
		System.out.println(num2);
		
		
	}
	public static int fn(int n)
	{
		if(n==2)
		{
			return 2;
		}
		else
		{
			return n*fn(n-1);
		}
	}
	
	//菲薄那契数列
	public static int feibonaqie(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
		else
		{
			return feibonaqie(n-1)+feibonaqie(n-2);
		}
	}

}
