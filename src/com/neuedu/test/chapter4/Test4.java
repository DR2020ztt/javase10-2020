package com.neuedu.test.chapter4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ð������
		int[] arr={12,22,3,56,34,78,21};
		
		for(int i=1;i<arr.length;i++)//i�Ƚ�����=>��һ��������ֵ���ڶ�������ڶ����ֵ
		{
			for(int j=0;j<arr.length-i;j++)//j�Ƚϴ�������ֵ֮���໥�Ƚ�
				//���ǳ������⣬ÿһ�������һ�ε����ֵ����Ҫ�������ֵ��ȥ���ٽ��бȽ�
				//�����һ��������ֵ֮��ԭ���������������ڱ����������Ƚϣ�ÿһѭ��һ����
				//������arr.length-i
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
