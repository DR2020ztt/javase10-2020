package com.neuedu.test.chapter7.copy;

public class TestAlarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//向上转型
		AlarmDoor a=new AlarmDoor();
		//向上/下转型在接口都实现
		//接口的方法
		a.alert();
		
		a.length=100;
		a.width=50;
		a.close();
		
		System.out.println(a.cst);
		
		a.test();
	}

}


interface Test
{
	String cst="test";
	
	public void test();
}
class Door
{
	String brand;
	int length;
	int width;

	public void open()
	{
		System.out.println("open");
	}
	public void close()
	{
		System.out.println("close");
	}
}
/*
 * 接口，有多重继承的效果
 */
class AlarmDoor extends Door implements Alarm,Test//Alarm接口，AlarmDoor接口实现类
{

	@Override
	public void alert() {
		// TODO Auto-generated method stub
		
		System.out.println("alert");
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}