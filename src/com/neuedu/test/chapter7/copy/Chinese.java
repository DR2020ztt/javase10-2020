package com.neuedu.test.chapter7.copy;

public class Chinese {

	
	
	String name;
	static String country/*="�й�"*/;//���ж��������
	int age;
	
	//����ص��ڴ棬�Զ�ִ��
	
	/*
	 * ��ʲôʱ�򱻼��ص��ڴ棺
	 * 
	 * 1��Chinese.����/����
	 * 2.Chinese c=new Chinese();
	 * һ����ִ��
	 */
	
	/*
	 * ����
	 * ��̬�����->�ȼ��ص��ڴ�
	 * ��ͨ����
	 * ���췽��
	 */
	
	/*
	 * ���ã�������static�����Ը���ֵ��
	 */
	static
	{
		country="�й�";
		
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
	 * �ر�ע�⣺static�ķ�����ֻ�ܷ���static������
	 *        static�ķ����ﲻ��дthis,super
	 *        
	 * ʲô���������static��������û�ж������ԣ������Զ���ɾ�̬��
	 * 
	 * ����ɾ�̬�ĺô������õ�ʱ��ֱ��������.�������Ϳ���
	 */
	
	
	
	public static void showInfo()
	{
		System.out.println("hello world");
	}
	
	public void showName()
	{
		//���Է���static���ԣ�
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
		//c1.country="�й�";
		Chinese.country="�й�";//�Ƽ������ַ�ʽ
		c1.age=20;
		
		
		Chinese c2=new Chinese();
		c2.country="�л����񹲺͹�";
		System.out.println(Chinese.country);
		

		Chinese.showInfo();
		c1.showInfo();
		showInfo();//static�������ֱ࣬�ӵ���
	}

}
