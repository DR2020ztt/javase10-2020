package com.neuedu.test.chapter2;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=a;
		b+=a;//b=b+a
		b-=a;//b=b-a
		b*=a;//b=b*a
		b/=a;//b=b/a
		b%=a;//b=b%a
		
		System.out.println(b);
		
		
		//��ϵ�����
		//> >= < <= == !=
		//��ϵ����Ľ����boolean
		
		System.out.println(a>b);//true
		
		boolean flag= a==b;
		
		System.out.println(flag);//flase

	}

}
