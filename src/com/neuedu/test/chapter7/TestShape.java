package com.neuedu.test.chapter7;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.创建一个Square对象
		Square s=new Square();
		s.setBianchang(10);
		System.out.println(s.getArea());
		
		Circle c=new Circle();
		c.setRadius(2);
		System.out.println(c.getArea());
		
		
		
	}

}
class Shape
{
	public double getArea()
	{
		return 0;
	}
}

class Square extends Shape
{

	private int bianchang;
	
	public int getBianchang() {
		return bianchang;
	}

	public void setBianchang(int bianchang) {
		this.bianchang = bianchang;
	}

	
	//右键Scource->Override
	@Override
	public double getArea() {
		return this.bianchang*this.bianchang;
	}
	
}

class Circle extends Shape
{
	private int radius;

	public int getRadius() {
		return radius;
	}

	//set一个值
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//get一个值->return 值
	@Override
	public double getArea() {
		return this.radius*this.radius*3.14;
	}
}















