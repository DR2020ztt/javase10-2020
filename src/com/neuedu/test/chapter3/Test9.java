package com.neuedu.test.chapter3;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//4%��Ϣ10000��3��
		
		double sum=10000;
		
		int i=0;
		//i����ѭ������
		while(i<3)
		{
			sum*=(1+0.04);
			i++;
		}
		

		System.out.println(sum);
	}

}
