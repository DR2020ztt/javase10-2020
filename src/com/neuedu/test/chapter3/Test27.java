package com.neuedu.test.chapter3;

public class Test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//分解质因数
		int x=90;
		System.out.println(x+"=");
		for(int a=2;a<=x;a++)
		{
			while(a!=x)
			{
				if(x%a==0)
				{
					System.out.println(a+"*");
					x=x/a;
				}
					else
					{
						break;
					}
				
				
			}
		}
		System.out.println(x);
		
	}

}
