package com.neuedu.test.chapter7.copy;
/*
 * Cola公司的雇员分为以下若干类：
ColaEmployee ：这是所有员工总的父类，属性：员工的姓名,员工的生日月份。方法：getSalary(int month) 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。

SalariedEmployee ： ColaEmployee 的子类，拿固定工资的员工。属性：月薪

HourlyEmployee ：ColaEmployee 的子类，按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。属性：每小时的工资、每月工作的小时数

SalesEmployee ：ColaEmployee 的子类，销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率

定义一个类Company，在该类中写一个方法，调用该方法可以打印出某月某个员工的工资数额，写一个测试类TestCompany,在main方法，
把若干各种类型的员工放在一个ColaEmployee 数组里，并单元出数组中每个员工当月的工资。
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