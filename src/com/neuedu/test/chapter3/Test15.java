package com.neuedu.test.chapter3;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//100万存三年，利率4%，按月付息，每月给多少利息，取12月利息之后要全部取出来，银行定期一年0.3%，银行能给多少，
		//**重点
				//不能定义一个新的变量y用来计算三年利率
				//因为y=a*(1+0.04);时
				//a的值一直没有变，所以不论怎么循环，y数值不变
				//a=a*(1+0.04);随着a的变化，循环时数值也在变化
				
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
		System.out.println("月利息"+z);
		System.out.println("银行给"+d);*/
		
		//1.三年以后的本息合计
		double sum=1000000;
		
		for(int i=0;i<3;i++)
		{
			sum=sum*(1+0.04);
		}
		
		double month_money=(sum-1000000)/36;
		
		System.out.println(month_money);
		
		//一年就取
		double sum2=1000000*(1+0.003);
		
		double refund=sum2-month_money*12;
		
		System.out.println(refund);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
