package com.neuedu.test.chapter2;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//十进制
		int a =10;
		
		//十六进制
		int b = 0XB51;//16
		
		//八进制
		int c =010;//8
		
		//二进制
		int d =0B100;//4
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		//进制互转
		//十进制》 十六，八，二（短除法）
		//十六，八，二》十进制（权法）

		
		//十进制转换其他进制
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		
		

	}

}
