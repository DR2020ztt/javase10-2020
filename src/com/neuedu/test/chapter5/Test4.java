package com.neuedu.test.chapter5;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//  ��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5�� 
		jiecheng(5);
		
		System.out.println(zhishu(200));
		
	}
	public static int jiecheng(int n)
	{
		int sum=1;
		for(int i=1;i<=1;i--)
		{
			
			sum*=i;
		}
		return sum;
		
	}
	
	
	//��дһ���������жϸ������ƽ�껹�����ꡣ 
	public static boolean isLeapYear(int year)
	{
		if(year%400==0)
		{
			return true;
		}
		if(year%4==0&&year%100!=0)
		{
			return true;
		}
		
			return false;	
	}
	//��дһ���������������200����С�������� 
	public static int zhishu(int n)
	{
		for(int i=n+1; ;i++)
		{
			boolean flag=true;//������
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					flag=false;//��������
					break;
				}
			}
			if(flag)
			{
				return i;
			}
		}
	}

	//дһ�����������ܣ�����һ��һά��int ���飬��������,Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩡�


}
