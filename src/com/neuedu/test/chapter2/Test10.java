package com.neuedu.test.chapter2;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		System.out.println(x^y);//相同为false，不同为true
		
		System.out.println("==============");
		
		
		int a=100;
		int b=200;
		int c=300;
		
		//&& || 短路运算
		//一个条件成立，则只运算一个，不运算另一个
		boolean flag1= a>b && b++<c;
		
		
		System.out.println(b);
		boolean flag2= a>b || b++>c;
		System.out.println(b);
		
		
		System.out.println("==============");
		//& | 不短路
		//所有条件都运算，不管成立与否
		int x1=200;
		int y1=300;
		int z1=400;
		
		boolean b1 = x1>y1 & y1++<z1;
		
		System.out.println(y1);
		
		//三元运算符
		
		char sex='M';
		String str =sex=='F'? "女":"男";
		System.out.println(str);
		
		int xx=10;
		int yy=20;
		int zz=30;
		
		int max= xx>=yy ?xx:yy;
		
		max= max>=zz?max:zz ;
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
