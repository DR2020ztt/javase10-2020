package com.neuedu.test.chapter7.copy;
/*
 * 抽象类vs接口
 * 
 * 抽象类：子类 is a 父类
 * 接口：子类   has 接口的行为
 * 
 * 1）抽象类有属性，接口没有属性（可以有常量）【最核心的区别】
 * 2）
 * 
 */
public class TestShape {

	public static void main(String[] args) {
		 //Shape s=new Shape();
		
		//Circle c=new Circle();
		
		Shape.test();
		Child c=new Child();
	}
}
/*
 * 抽象类中可以有抽象方法，也可以有非抽象方法
 * 
 * 注意：
 * 1）抽象类不能new对象，不完整
 */
interface Shape
//abstract class Shape
{
	public abstract double getArea();
	
	public abstract double getPer();
	
	//default public static void test()
	public static void test()
	{
		
	}
}
class Circle implements Shape
//abstract class Circle extends Shape
{

	int radius;
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*this.radius*this.radius;
	}

	@Override
	public double getPer()
	{
		return this.radius*3.14*2;
	}
	
	
	
	public void test()
	{
		Shape.test();
	}
	
}

class Child extends Circle
{
	

	@Override
	public double getPer() {
		return 0;
	}
}