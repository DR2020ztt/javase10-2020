package com.neuedu.test.chapter6;

import java.util.Random;

public class TestFighter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建两个战士
		Fighter f1=new Fighter("大毛");
		Fighter f2=new Fighter("二毛");
		
		Random r=new Random();
		while(true)
		{
			//f1被砍一刀
			int num=r.nextInt(10);//0-9之间的随机数
			f1.takeDamage(num);
			
			if(f1.blood<=0)
			{
				break;
			}
			//f2被砍一刀
			int num2=r.nextInt(10);
			f2.takeDamage(num2);
			
			if(f2.blood<=0)
			{
				break;
			}
			     
		}
	}

}
class Fighter
{
	//默认为100
	String name;
	int blood;
	
	public Fighter(String name)
	{
		this.name=name;
		this.blood=100;
	}
	public void takeDamage(int num)
	{
		this.blood-=num;
		if(this.blood<=0)
		{
			System.out.println(name+"死了,blood="+this.blood);
		}
		else
		{
			System.out.println(name+"被砍一刀,blood="+blood);
		}
	}
}