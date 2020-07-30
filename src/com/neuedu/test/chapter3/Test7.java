package com.neuedu.test.chapter3;

public class Test7 {
	public static void main(String[] args) {
		//8µÃ½×³Ë
		int sum=1;
		int i=8;//i=2
		while(i>1)//(i<8)
		{
			sum*=i;
			i--;//i++
		}
		System.out.println("sum="+sum);
	}

}
