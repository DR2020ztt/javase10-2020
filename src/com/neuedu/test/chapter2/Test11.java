package com.neuedu.test.chapter2;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		int a=1;
		int b=2;
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
		
		//给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12
		//注：分解数字既可以先除后模也可以先模后除。
		int m=862;
		int n;
		n=m/100+m/10%10+m%10;
		System.out.println(n);
		
		
		//华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，
		//乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，
		//再加上32即行。
		
		float hua=100;
		float she=200;
		
		
		
		//给定一个任意的大写字母A~Z，转换为小写字母。
		
		int y='Y';
		
		

	}

}
