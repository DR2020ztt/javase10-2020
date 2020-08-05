package com.neuedu.test.chapter7.copy;
/*
 * Cola��˾�Ĺ�Ա��Ϊ���������ࣺ
ColaEmployee ����������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100 Ԫ��

SalariedEmployee �� ColaEmployee �����࣬�ù̶����ʵ�Ա�������ԣ���н

HourlyEmployee ��ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5 �����ʷ��š����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��

SalesEmployee ��ColaEmployee �����࣬������Ա�������������۶������ʾ��������ԣ������۶�����

����һ����Company���ڸ�����дһ�����������ø÷������Դ�ӡ��ĳ��ĳ��Ա���Ĺ������дһ��������TestCompany,��main������
�����ɸ������͵�Ա������һ��ColaEmployee ���������Ԫ��������ÿ��Ա�����µĹ��ʡ�
 */
public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColaEmployee[] emps=new ColaEmployee[3];
		
		emps[0]=new SalariedEmployee("AA",8,8000);
		emps[1]=new HourlyEmployee("BB",8,8000);
		emps[2]=new SalesEmployee("CC",8,13952.2,1.5);
		
		
		Company c=new Company();
		
		for (ColaEmployee e:emps)
		{
			c.showInfo(e, 8);
				
		
				}
				
	}

}

class Company
{
	public void showInfo(ColaEmployee c,int month)
	{
		//c.getSalary(month);
		System.out.println(c.name+","+c.getSalary(month));

	}
}
class ColaEmployee
{
	String name;
	int birth;
	
	public ColaEmployee(String name,int birth)
	{
		this.name=name;
		this.birth=birth;
	}
	
	
	public double getSalary(int month)
	{
		if(month==birth)
		{
			return 100;
		}
		else
		{
			return 0;
		}
	}
	

}

class SalariedEmployee extends ColaEmployee
{
	double salary;
	
	public SalariedEmployee(String name,int birth,double msakary)
	{
		super(name,birth);
		this.salary=salary;
		
	}

	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month)+this.salary;
		
	}
	
	
}

class HourlyEmployee extends ColaEmployee
{
	double hsal;
	int hours;
	
	public HourlyEmployee(String name,int birth,double hsal)
	{
		super(name,birth);
		this.hsal=hsal;
	}
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		double total=0;
		if(hours>160)
		{
			total=(hours-160)*hsal*1.5+160*hsal;
		}
		else
		{
			total=hours*hsal;
		}
		return super.getSalary(month)+total;
	}
	
}

class SalesEmployee extends ColaEmployee
{
	double money;
	double percentage;
	
	public SalesEmployee(String name,int birth,double money,double percentage)
	{
		super(name,birth);
		this.money=money;
	}
	
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month) + this.money * this.percentage;

	}
}