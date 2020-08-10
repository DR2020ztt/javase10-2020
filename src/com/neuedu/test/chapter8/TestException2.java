package com.neuedu.test.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {

	//catch块注意顺序问题，子类异常在前，父类异常在后
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;//算数异常
			
			
			int[] arr=new int[2];
			arr[2]=10;//越界异常
			
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();//输入不匹配
			
			FileInputStream ins=new FileInputStream("d:/a.txt");
		}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		//两个异常不可以有父子关系
		{
			System.out.println("算数异常");
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("数组越界异常");
		}*/
		catch(InputMismatchException e)
		{
			System.out.println("输入错误");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(RuntimeException e)
		{
			System.out.println("运行时异常");
		}
		//父类异常
		catch(Exception e)
		{
			System.out.println("出异常了");
		}
		System.out.println("contine……");
	}

}
