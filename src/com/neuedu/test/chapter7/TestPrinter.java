package com.neuedu.test.chapter7;

/*
 * 
 * 1.�и��Ӽ̳й�ϵ
 * 2.������д���෽��
 * 3.��������ָ���������->����ת��
 * 
 */
public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer p=new ColoredPrinter();
		
		//�ر�ע�⣺���õĲ��Ǹ������ķ��������Ǿ�������ķ���
		p.print();//�����˶�̬��Ч��
		
		
		
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