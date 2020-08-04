package com.neuedu.test.chapter7;

public class Officier extends Employee{

	double vehicleAllowance;
	
	public Officier()
	{
		//调用父类无参构造方法
		//默认编译器会加上
		//super()必须放在构造器里是第一句话
		super();
		System.out.println("officier");
	}
	
	
	
	
	public Officier(double vehicleAllowance)
	{
		//super()
		this.vehicleAllowance=vehicleAllowance;
	}
	
	public double getVehicrAllowance()
	{
		return this.vehicleAllowance;
	}
	
	
	public Officier(String name,int age,String department,double vehicleAllowance)
	{
		/*this.name=name;
		this.age=age;
		this.department=department;*/
		super(name,age,department);
		this.vehicleAllowance=vehicleAllowance;
		System.out.println(this.name+","+this.age+","+this.department
				           +","+this.vehicleAllowance);
	}
	/*public void work()
	{
		System.out.println("work officier");
	}*/
	@Override
	public void getDetail()
	{
		/*System.out.println(
				this.name+","+this.age+","+this.department
				+","+this.vehicleAllowance);*/
		super.getDetail();
		System.out.println(this.vehicleAllowance);
	}
	//super和this什么时候有区别
	//当父类与子类中有不同的方法调用->用this和super没有区别
	//当父类与子类中有相同的方法调用->this调用当前子类方法，super调用父类方法
	public void test()
	{
		//super在子类中访问，代表父类对象
		//System.out.println(super.name+","+super.age+","+super.department);
		//System.out.println(this.name+","+this.age+","+this.department);
	
		
		//调用当前对象的work方法
		//this.work();
		//调用父类对象的work方法
		//super.work();
	
	}

	public static void main(String[] args) {
		
		//创建一个子类对象
		/*Officier o=new Officier();
		o.name="xaio hong";
		o.age=18;
		o.department="research";
		o.vehicleAllowance=200;
		
		o.work();
		o.getVehicrAllowance();
		o.test();*/
		
		//有参的
		Officier o2=new Officier(200);
		//o2.work();
		
		Officier o3=new Officier("ming",18,"rea",200.0);
	
		o3.getDetail();
	}
}
