package com.neuedu.test.chapter3;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//4%利息10000存3年
		
		double sum=10000;
		
		int i=0;
		//i控制循环次数
		while(i<3)
		{
			sum*=(1+0.04);
			i++;
		}
		

		System.out.println(sum);
	}

}
