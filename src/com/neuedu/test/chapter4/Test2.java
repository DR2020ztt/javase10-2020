package com.neuedu.test.chapter4;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//求数组的最大值和最小值
		int[] arr={23,45,67,88,92,8};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println("max="+max+",min="+min);
		
	}

}
