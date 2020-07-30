package com.neuedu.test.chapter3;

public class Test25 {   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	for(int i=0;i<=100;i++)
		{
			for(int j=0;j<=100;j++)
			{
				for(int z=0;z<=100;z++)
				{
					if(i+j+z==100 && 3*i+4*j+0.5*z==100)
					{
						System.out.println("Ä¸¼¦£º"+i+"¹«¼¦£º"+j+"Ð¡¼¦£º"+z);
					}
				}
			}
		}*/
		
		for(int i=0;i<=33;i++)
		{
			for(int j=0;j<=25;j++)
			{
				int k=100-i-j;
				if(i+j+k==100 && 3*i+4*j+0.5*k==100)
				{
					System.out.println("Ä¸¼¦£º"+i+"¹«¼¦£º"+j+"Ð¡¼¦£º"+k);
				}
			}
		}
	}

}
