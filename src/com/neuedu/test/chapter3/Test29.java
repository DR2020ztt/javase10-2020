package com.neuedu.test.chapter3;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
		int x=1234;
		for(int i=1;i<=4;i++)
		{
			int y=x%10;
			System.out.print(y);
			x=x/10;
			
		}
		
	
		
		
		
		
	}

}

