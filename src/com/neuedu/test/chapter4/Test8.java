package com.neuedu.test.chapter4;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 将一个数组中的重复元素保留一个其他的清零。
		int[] arr={2,3,2,4,5,4};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
			
			}
			
		}
		}

		for(int item:arr)
		{
			System.out.println(item);
		}
		
		
	}

}
