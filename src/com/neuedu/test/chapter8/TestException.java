package com.neuedu.test.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//RuntimeException 运行时异常（非检查性异常）
		
		int a=10;
		int b=0;
		
		try
		{
			int c=a/b;
			
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();//打印异常
			System.out.println("catch e");
		}
		
		//IO Exception 非运行时异常（检查性异常）
		
		try {
			FileInputStream ins =new FileInputStream("d:a.txt");//可能引发异常
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("XXX");
		
		
		
		//
		Scanner sc=new Scanner(System.in);
		
		try
		{
			int num=sc.nextInt();
			System.out.println(num);
		}
		
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		
		
		try
		{
			int[] arr=new int[3];
			arr[3]=2;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
