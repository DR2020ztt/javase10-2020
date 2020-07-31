package com.neuedu.test.chapter4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//数组是定长的
		//动态初始化
		int [] arr=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		//静态初始化
		int [] arr2={80,23,45,67};//长度定了
		
		arr2[2]=55;
		System.out.println(arr2[2]);
	
	
		//char[] cs={'a','b','c'};
		
	
		int [] scores={80,23,45,67,90};//长度定了
		//int avg=(scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5
	
		System.out.println(scores.length);
		int sum=0;
		for(int i=0;i<scores.length;i++)
		{
			sum+=scores[i];
		}
		double avg=(double)sum/scores.length;
		System.out.println(avg);
	
	
	
	
	
	
	
	
	
	}

}
