package com.neuedu.test.chapter2;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=2;
		
		double c=(double)5/2;
		
		
		//a+b的和是？=>字符串拼接
		System.out.println("a+b的和是"+(a+b));
		System.out.println("a-b的差是"+(a-b));
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(c);
		
		//打印出？是班长
		String str="毛毛";
		System.out.println(str+"是班长");

		int money=50000;
		//我有？钱
		System.out.println("我有"+money+"钱");
		
		//除法中的负数
		System.out.println(5/2);
		System.out.println(5/-2);
		System.out.println(-5/2);
		System.out.println(-5/-2);
		
		
		System.out.println("=======================");
		
		//求余数(余数正负看被除数正负)
		System.out.println(5%2);
		System.out.println(5%-2);
		System.out.println(-5%2);
		System.out.println(-5%-2);
		
		
		//自增，自减
		int x=1;
		/*
		 * //先用后加
		x++;
		//先加后用
		++x;
		*/
		int y=x++;
		System.out.println(x);
		System.out.println(y);
		
		//i=i++     没有变化，无用
		int h=1;
		h=h++;
		System.out.println(h);
		
		
		
		
		
	}

}
