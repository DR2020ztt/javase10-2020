package com.neuedu.test.chapter4;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={12,34,56,7,8,34};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		//����ı���
		for(int item:arr)
		{
			System.out.println(item);//item�Լ��������
		}
		//���ֲ���
		int index=Arrays.binarySearch(arr, 12);
		System.out.println(index);
	}

}
