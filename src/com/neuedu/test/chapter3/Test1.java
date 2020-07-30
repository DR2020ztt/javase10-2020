package com.neuedu.test.chapter3;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*if(true)
		{

			System.out.println(true);
	}
		System.out.println("output anyway");*/
		
		
		int n=7;
		if(n%2==0){
			System.out.println(n+"是一个偶数");
		}
		else{
			System.out.println(n+"是一个奇数");
		}
		
		
		
		
		int i = 55;
        if (i <= 100 && i >= 90) {
            System.out.println("成绩是A");
        } else if (i >= 80) {
            System.out.println("成绩是B");
        } else if (i >= 70) {
            System.out.println("成绩是C");
        } else if (i >= 60) {
            System.out.println("成绩是D");
        } else {
            System.out.println("成绩是E");
        }
	}

}
