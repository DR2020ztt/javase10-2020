package com.neuedu.test.chapter3;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int year = 2000;
		
		if(year %400 ==0)
		{
			System.out.println(year +"是闰年");
		}
		else if(year %4 ==0 && year %100!=0)
		{
			System.out.println(year +"是闰年");
		}
		else
		{
			System.out.println(year +"不是闰年");
		}

	}

}
