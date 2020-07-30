package com.neuedu.test.chapter3;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//判断一个数字是否能被5和6同时整除（打印能被5和6整除），或只能被5整除（打印能被5整除），
		//或只能被6整除，（打印能被6整除），不能被5或6整除，（打印不能被5或6整除）
		
		int num=30;
		if(num %5==0 && num %6==0)
		{
			System.out.println("能被5和6整除");
			
		}
		else if(num%5==0)
		{
			System.out.println("能被5整除");
		}
		else if(num%6==0)
		{
			System.out.println("能被6整除");
		}
		else{
				System.out.println("不能被5和6整除");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
