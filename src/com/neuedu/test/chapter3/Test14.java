package com.neuedu.test.chapter3;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ж�һ�����ǲ���������������������1�ͱ���֮�󣬲��ܱ���������
		
		int n=101;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("��������");
				return;
			}
		}

		System.out.println("������");
	}

}
