package com.neuedu.test.chapter7.copy;
/*
 * ��д����ϵ���ѧ���ࣺӢ��ϵ�������ϵ����ѧϵ��Ҫ��ͨ���̳�ѧ���ࣩ
a) ��ϵ�����³ɼ���

Ӣ��ϵ���ݽ�����ĩ���ԣ����п��ԣ�

�����ϵ������������Ӣ��д�������п��ԣ���ĩ���ԣ�

��ѧϵ���ݽ�����Ʒ����ĩ���ԣ����п���;

b) ��ϵ�ܷ������׼��

Ӣ��ϵ���ݽ� 50%

��ĩ���� 25%

���п��� 25%

�����ϵ���������� 40%

Ӣ��д�� 20%

��ĩ���� 20%

���п��� 20%

��ѧϵ���ݽ� 35%

��Ʒ 35%

��ĩ���� 15%

���п��� 15%

c) ����һ��������5��ѧ����ѧ�������飬ʹ���������������װ���ϵѧ���Ķ���Ȼ�����¸�ʽ��������е���Ϣ��

ѧ��:XXXXXXXX ������XXX �Ա�X ���䣺XX �ۺϳɼ���XX
 */
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr = new Student[5];
		
		//��5��ѧ��
		arr[0] = new English("xiaohong",88,99,95);//�˴�������ת��
		arr[1] = new Computer("xioli",90,91,92,77);
		arr[2] = new Literature("xiaowang",88,89,94,75);
		arr[3] = new English("xiaomao",77,88,96);//�˴�������ת��
		arr[4] = new Computer("xiaogang",92,91,93,82);
		
		//ѭ������
		for(Student s: arr)
		{
			System.out.println(s.name +":"+s.getTotalScore());//�����˶�̬
		}
		
        
	}

}

 abstract class Student{
	
	String name;	
	double midscore;
	double endscore;
	
	public Student(String name, double midscore, double endscore)
	{
		this.name = name;
		this.midscore = midscore;
		this.endscore = endscore;
	}
	
	//�����������׼������һ��Ҫ��д�������
	public abstract double getTotalScore();
	
}

class English extends Student{
	
	double speech;
	
	public English(String name, double speech, double midscore, double endscore)
	{		
		super(name, midscore,endscore);		
		this.speech = speech;
	}
	
	@Override
	public double getTotalScore()
	{
		return this.speech * 0.5 + super.midscore*0.25 + super.endscore*0.25;
	}
}

class Computer extends Student{
	
	double operation;
	double writing;
	
	public Computer(String name, double operation, double writing, double midscore, double endscore)
	{
		super(name,midscore,endscore);
		this.operation = operation;
		this.writing = writing;
	}
	
	@Override
	public double getTotalScore()
	{
		return this.operation * 0.4 + this.writing *0.2 + super.midscore*0.2 + super.endscore*0.2;
	}
	
}

class Literature extends Student{
	
	double speech;
	double product;
	
	public Literature(String name, double speech, double product, double midscore, double endscore)
	{
		super(name,midscore,endscore);
		this.speech = speech;
		this.product = product;
	}
	
	@Override
	public double getTotalScore()
	{
		return this.speech * 0.35 +this.product*0.35 +super.midscore*0.15 + super.endscore*0.15;
	}
	
}
