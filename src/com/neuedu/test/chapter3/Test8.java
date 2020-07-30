package com.neuedu.test.chapter3;

public class Test8 {
	public static void main(String[] args) {
		
		//1+1/2+1/3+бнбн+1/100
		double sum=0;
		double i=1;
		while(i<100)
		{
			sum+=1/i;
			i++;
		}
		System.out.println("sum="+sum);
		
	}

}
