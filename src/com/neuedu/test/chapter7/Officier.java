package com.neuedu.test.chapter7;

public class Officier extends Employee{

	double vehicleAllowance;
	
	public Officier()
	{
		//���ø����޲ι��췽��
		//Ĭ�ϱ����������
		//super()������ڹ��������ǵ�һ�仰
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
	//super��thisʲôʱ��������
	//���������������в�ͬ�ķ�������->��this��superû������
	//������������������ͬ�ķ�������->this���õ�ǰ���෽����super���ø��෽��
	public void test()
	{
		//super�������з��ʣ����������
		//System.out.println(super.name+","+super.age+","+super.department);
		//System.out.println(this.name+","+this.age+","+this.department);
	
		
		//���õ�ǰ�����work����
		//this.work();
		//���ø�������work����
		//super.work();
	
	}

	public static void main(String[] args) {
		
		//����һ���������
		/*Officier o=new Officier();
		o.name="xaio hong";
		o.age=18;
		o.department="research";
		o.vehicleAllowance=200;
		
		o.work();
		o.getVehicrAllowance();
		o.test();*/
		
		//�вε�
		Officier o2=new Officier(200);
		//o2.work();
		
		Officier o3=new Officier("ming",18,"rea",200.0);
	
		o3.getDetail();
	}
}
