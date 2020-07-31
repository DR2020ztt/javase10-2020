package com.neuedu.test.chapter5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//非static类，需要new一个方法，
		//然后再调用方法
		Test t1=new Test();
		
		
		
		
		//打印5行6列的*
		t1.printStar(5,6);
		//打印4行5列的*
		t1.printStar(4,5);
		
		
		int ret=square(9);
		int max=max(5,7);
		System.out.println(max);
		sayHello();
	}
		
		public static void printStar(int m,int n)
		{
		
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		
		
		public static int square(int m)
		{
			return m*m;
		}
		
		public static int max(int a,int b)
		{
			return a>b?a:b;
		}
		public static void sayHello()
		{
			System.out.println();
		}
		
		public static int[] getArr(int a,int b,int c)
		{
			int[] arr={a,b,c};
			return arr;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
