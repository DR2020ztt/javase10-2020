package com.neuedu.test.chapter7.copy;
/*
 * ������vs�ӿ�
 * 
 * �����ࣺ���� is a ����
 * �ӿڣ�����   has �ӿڵ���Ϊ
 * 
 * 1�������������ԣ��ӿ�û�����ԣ������г�����������ĵ�����
 * 2��
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
 * �������п����г��󷽷���Ҳ�����зǳ��󷽷�
 * 
 * ע�⣺
 * 1�������಻��new���󣬲�����
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