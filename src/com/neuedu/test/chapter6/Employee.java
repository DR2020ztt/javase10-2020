package com.neuedu.test.chapter6;

public class Employee {
	
	
	
	
	//属性->有默认值
	String name;
	int age;
	double salary;
	
	
	//默认的构造方法(构造器)
		//1.方法名必须跟类名一样
		//2.不能有返回值
		public Employee()
		{
			//在一个构造方法里调用另一个构造方法
			//this("JONE DOE",18,200);
			
			//this()必须放在构造方法的第一句话上
			this("JONE DOE");
			this.age=20;
			this.salary=200;
			
			
			
			
			/*this.name="JOE DOE";
			this.age=18;
			this.salary=200;*/
		}
		
		//有参的构造方法
		//构造方法也可以重载
		//特别注意：如果自己定义了构造方法，jdk就不会生成默认的无参构造方法=》
		//一旦自己有了参，一定把无参写出来
		//this代表当前对象
		public Employee(String name,int age,double salary)
		{
			this.name=name;
			this.age=age;
			this.salary=salary;
		}
		
		
		public Employee(String name)
		{
			this.name=name;
		}
		
		
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void updateName(String _name)
	{
		name=_name;
	}
	public double getSalary()
	{
		return salary;
	}
	public static void main(String[] args) {
		//创建一个员工的对象
		//new Employee(),调用类的构造方法
		Employee e1=new Employee();
		e1.name ="ztt";
		e1.updateName("james");
		
		System.out.println(e1.name);
		System.out.println(e1.getName());
		
		//使用有参的构造方法创建一个员工
		Employee e2=new Employee("maomao",6,33.22);
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.salary);
		
		
		//再创建一个员工
		 Employee e3 = new Employee("lele");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Employee e1=new Employee();
		
		e1.name="zhangsan";
		e1.age=25;
		e1.salary=8888.88;
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		//在创建一个员工对象
		Employee e2=new Employee();
		
		e2.name="lisi";
		e2.age=26;
		e2.salary=6666.66;
		
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.getSalary());*/
		
		
		
	
	}

}
