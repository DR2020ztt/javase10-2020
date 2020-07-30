package com.neuedu.test.chapter3;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=1; ;i++)
		{
			sum+=i;
			if(sum>=666)
			{
				System.out.println(sum);
				System.out.println(i);
				break;//go to here跳出循环
				//return结束方法
			}
		}
		//here
	}

}
