package com.neuedu.test.chapter9;

import java.util.Scanner;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder builder=new StringBuilder(); 
		for(int i=0;i<10;i++)
		{
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			//׷��
			builder.append(str+"-");
					
		}
		//ɾ�����һ��-
		builder.deleteCharAt(builder.length()-1);
		
		System.out.println(builder);
	}

}
