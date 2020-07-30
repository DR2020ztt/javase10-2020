package com.neuedu.test.chapter2;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1=3;
		int y1=5;
		
		int r1=x1++ + x1*y1;
		
		//字符串常量和变量用 + 连接
		System.out.println("x1=" + x1 + "y1=" + y1 + "r1=" + r1);

		
		char c = 'a';
	    String s = "hello";
	    int i = 100;
	    float f = 2.15f;
	    double d = 5.7;
	    boolean b = true;
	    System.out.println("c=" + c);
	    System.out.println("s=" + s);
	    System.out.println("i=" + i);
	    System.out.println("f=" + f);
	    System.out.println("d=" + d);
	    System.out.println("b=" + b);
	}

}
