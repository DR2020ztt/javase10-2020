package com.neuedu.test.chapter3;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int num=200; ;num++)
		{
			boolean flag=true;//������
			int i=2;
			for(;i<=num-1;i++)
			{
				if(num%i==0)
				{
					flag=false;//��������
					//������
					System.out.println("��������");
					break;
				}
			}
			//break������
			if(flag)//һ����û����
			{
				
				System.out.println("������");
				//ֱ���ҵ���
				System.out.println(num);
				break;
			}
		}
		
		
		
	}

}
