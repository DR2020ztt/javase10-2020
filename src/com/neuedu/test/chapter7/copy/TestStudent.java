package com.neuedu.test.chapter7.copy;
/*
 * 编写三个系别的学生类：英语系，计算机系，文学系（要求通过继承学生类）
a) 各系有以下成绩：

英语系：演讲，期末考试，期中考试；

计算机系：操作能力，英语写作，期中考试，期末考试；

文学系：演讲，作品，期末考试，期中考试;

b) 各系总分评测标准：

英语系：演讲 50%

期末考试 25%

期中考试 25%

计算机系：操作能力 40%

英语写作 20%

期末考试 20%

期中考试 20%

文学系：演讲 35%

作品 35%

期末考试 15%

期中考试 15%

c) 定义一个可容纳5个学生的学生类数组，使用随机数给该数组装入各系学生的对象，然后按如下格式输出数组中的信息：

学号:XXXXXXXX 姓名：XXX 性别：X 年龄：XX 综合成绩：XX
 */
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr = new Student[5];
		
		//放5个学生
		arr[0] = new English("xiaohong",88,99,95);//此处有向上转型
		arr[1] = new Computer("xioli",90,91,92,77);
		arr[2] = new Literature("xiaowang",88,89,94,75);
		arr[3] = new English("xiaomao",77,88,96);//此处有向上转型
		arr[4] = new Computer("xiaogang",92,91,93,82);
		
		//循环数组
		for(Student s: arr)
		{
			System.out.println(s.name +":"+s.getTotalScore());//触发了多态
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
	
	//这个方法，标准，子类一定要重写这个方法
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
