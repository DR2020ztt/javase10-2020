package com.neuedu.test.chapter3;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		outer:for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.println(j);
				if(j==5)
				{
					break outer;
				}
			}
		}
	}

}
