package com.neuedu.test.chapter3;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int m=8;
		int n=12;
		
		int min=m<n?m:n;
		int result=min;
		for(int i=min;i>=1;i--)
		{
			if(m%i==0&&n%i==0)
			{
				result=i;
				break;
			}
		}
		System.out.println(m+"和"+n+"的最大公约数是"+result);
	
	
	}

}
