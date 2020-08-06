package com.neuedu.test.chapter7.copy;

public class Chinese {

	
	
	String name;
	static String country/*="中国"*/;//所有对象共享的类
	int age;
	
	//类加载到内存，自动执行
	
	/*
	 * 类什么时候被加载到内存：
	 * 
	 * 1、Chinese.属性/方法
	 * 2.Chinese c=new Chinese();
	 * 一次性执行
	 */
	
	/*
	 * 数序：
	 * 静态代码块->先加载到内存
	 * 普通代码
	 * 构造方法
	 */
	
	/*
	 * 作用：用来给static的属性赋初值的
	 */
	static
	{
		country="中国";
		
		System.out.println("static");
	}
	
	public Chinese()
	{
		System.out.println("constructor");
	}
	
	public Chinese(String nmae,int age)
	{
		this.name=name;
		this.age=age;
		
		System.out.println("constructor");
	}
	
	
	/*
	 * 特别注意：static的方法里只能访问static的属性
	 *        static的方法里不能写this,super
	 *        
	 * 什么方法定义成static：方法里没有对象属性，都可以定义成静态的
	 * 
	 * 定义成静态的好处：调用的时候，直接用类名.方法名就可以
	 */
	
	
	
	public static void showInfo()
	{
		System.out.println("hello world");
	}
	
	public void showName()
	{
		//可以访问static属性？
		System.out.println(country);
		System.out.println(name);
		System.out.println(age);
	}
	
	/*public void showName()
	{
		System.out.println(this.name);
	}*/
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Chinese c1=new Chinese();
		c1.name="AA";
		//c1.country="中国";
		Chinese.country="中国";//推荐用这种方式
		c1.age=20;
		
		
		Chinese c2=new Chinese();
		c2.country="中华人民共和国";
		System.out.println(Chinese.country);
		

		Chinese.showInfo();
		c1.showInfo();
		showInfo();//static隶属于类，直接调用
	}

}
