package com.neuedu.test.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {

	//catch��ע��˳�����⣬�����쳣��ǰ�������쳣�ں�
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;//�����쳣
			
			
			int[] arr=new int[2];
			arr[2]=10;//Խ���쳣
			
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();//���벻ƥ��
			
			FileInputStream ins=new FileInputStream("d:/a.txt");
		}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		//�����쳣�������и��ӹ�ϵ
		{
			System.out.println("�����쳣");
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("����Խ���쳣");
		}*/
		catch(InputMismatchException e)
		{
			System.out.println("�������");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(RuntimeException e)
		{
			System.out.println("����ʱ�쳣");
		}
		//�����쳣
		catch(Exception e)
		{
			System.out.println("���쳣��");
		}
		System.out.println("contine����");
	}

}
