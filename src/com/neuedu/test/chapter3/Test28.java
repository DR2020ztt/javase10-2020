package com.neuedu.test.chapter3;

public class Test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//求数字的有几位
		int x=888666;
		int i;
		for(i=1;i>0;i++)
		{
			if(x/10>0)
			{
				x=x/10;
			}
			else
			{
				break;
			}
		}
		System.out.println(i);

	}

}
