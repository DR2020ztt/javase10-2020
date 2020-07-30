package com.neuedu.test.chapter3;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		while(x<3)
		{
			System.out.println("x="+x);
			x++;
		}

		//1+2+3+¡­¡­+100ÇóºÍ
		int sum=0;
		int i=1;
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		System.out.println("sum="+sum);
	}

}
