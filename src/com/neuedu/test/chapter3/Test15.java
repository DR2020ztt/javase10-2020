package com.neuedu.test.chapter3;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//100������꣬����4%�����¸�Ϣ��ÿ�¸�������Ϣ��ȡ12����Ϣ֮��Ҫȫ��ȡ���������ж���һ��0.3%�������ܸ����٣�
		//**�ص�
				//���ܶ���һ���µı���y����������������
				//��Ϊy=a*(1+0.04);ʱ
				//a��ֵһֱû�б䣬���Բ�����ôѭ����y��ֵ����
				//a=a*(1+0.04);����a�ı仯��ѭ��ʱ��ֵҲ�ڱ仯
				
				/*double a=100;
				
				for(int x=1;x<4;x++)
				{
					 a=a*(1+0.04);
				}
				double z=(a-100)/36;
				double k=100*(1+0.003);
				double sum1=k-12*z;
				System.out.println(sum1);
		*/
				 
		
		
		/* 
		double x=1000000;
		double x1=x;
		for(int y=1;y<=3;y++){
			x1*=(1+0.04);
		}
		
		double z=(x1-x)/36;
		
		double a=12*z;
		double b=x;
		
			b*=(1+0.003);
		
		
		double d=b-a;
		System.out.println("����Ϣ"+z);
		System.out.println("���и�"+d);*/
		
		//1.�����Ժ�ı�Ϣ�ϼ�
		double sum=1000000;
		
		for(int i=0;i<3;i++)
		{
			sum=sum*(1+0.04);
		}
		
		double month_money=(sum-1000000)/36;
		
		System.out.println(month_money);
		
		//һ���ȡ
		double sum2=1000000*(1+0.003);
		
		double refund=sum2-month_money*12;
		
		System.out.println(refund);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
