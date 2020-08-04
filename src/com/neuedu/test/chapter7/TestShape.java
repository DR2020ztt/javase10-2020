package com.neuedu.test.chapter7;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.����һ��Square����
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

	
	//�Ҽ�Scource->Override
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

	//setһ��ֵ
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//getһ��ֵ->return ֵ
	@Override
	public double getArea() {
		return this.radius*this.radius*3.14;
	}
}















