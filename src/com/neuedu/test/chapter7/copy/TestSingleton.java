package com.neuedu.test.chapter7.copy;

import java.util.Random;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aa";
		
		Random r=new Random();
		
		//Singleton s1=new Singleton();
		//Singleton s2=new Singleton();
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}


/*
 * ����������Ҫ�أ�
 * 1.���췽��˽��(˽�е�ֻ�ܱ�����new)
 * 2.private static Singleton instance(˽��)
 * 3.public static Singleton getInstance()
 */
class Singleton
{
	/*
	 * ����ʽ
	 */
	private static Singleton instance=new Singleton();
	private Singleton()
	{
		
	}
	/*
	 * ����ʽ
	 */
	public static Singleton getInstance()
	{
		if(instance==null)
		{
			instance=new Singleton();
		}
		return instance;
	}
	
	
}