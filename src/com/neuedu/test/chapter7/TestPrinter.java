package com.neuedu.test.chapter7;

/*
 * 
 * 1.有父子继承关系
 * 2.子类重写父类方法
 * 3.父类引用指向子类对象->向上转型
 * 
 */
public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer p=new ColoredPrinter();
		
		//特别注意：调用的不是父类对象的方法，而是具体子类的方法
		p.print();//出现了多态的效果
		
		
		
	}

}

class Printer
{
	public void print()
	{
		System.out.println("print");
	}
}

class ColoredPrinter extends Printer
{

	@Override
	public void print() {
		System.out.println("coloredprint");
	}
	
}

class BlackWhitePrinter extends Printer
{
	@Override
	public void print() {
		System.out.println("blackwhiteprint");
	}
}