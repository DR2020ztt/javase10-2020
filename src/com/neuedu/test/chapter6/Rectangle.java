package com.neuedu.test.chapter6;


//����һ��������Rectangle�� a) ��������������
//getArea()�������getPer()���ܳ���showAll()
//�ֱ��ڿ���̨���������������ܳ��� 
//b) ��2�����ԣ���length����width 
//c) ͨ�����췽��Rectangle(int width, int length)
//���ֱ���������Ը�ֵ d) ����һ��Rectangle���󣬲���������Ϣ
public class Rectangle {

	int length;
	int width;
	
	public Rectangle()
	{
		
	}
	public Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
		
	}
	 public int getArea()
	 {
		 return this.length*width;
	 }
	 public int getPer()
	 {
		 return (this.length+this.width)*2;
	 }
	 public void showAll()
	 {
		 System.out.println("��Ϊ��"+this.length+"��Ϊ��"+this.width
				 + ",���Ϊ��" + this.getArea() + ",�ܳ�Ϊ��" + this.getPer());
	 }
	 public static void main(String[] args) {
		Rectangle r1=new Rectangle(200,100);
		
		r1.showAll();
	}
}
