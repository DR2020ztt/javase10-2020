package com.neuedu.test.chapter4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//冒泡排序
		int[] arr={12,22,3,56,34,78,21};
		
		for(int i=1;i<arr.length;i++)//i比较趟数=>第一次输出最大值，第二次输出第二大的值
		{
			for(int j=0;j<arr.length-i;j++)//j比较次数，数值之间相互比较
				//考虑沉底问题，每一次输出上一次的最大值，都要把输出的值减去，再进行比较
				//例如第一次输出最大值之后，原本是六个数，现在变成了五个数比较，每一循环一减少
				//所以是arr.length-i
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
