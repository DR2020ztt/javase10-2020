package com.neuedu.test.chapter9;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public static void main(String[] args) {
		
		//返回抽象类一个具体的子类
		
		//c代表当前系统时间
		Calendar c=Calendar.getInstance();
		
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONDAY);
		int date=c.get(Calendar.DATE);
		int hour=c.get(Calendar.HOUR_OF_DAY);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		
		String str= year + "-" + (month + 1) + "-" + date + " "+hour+":"+minute+":"+second;

				
		
		//设置时间的不同部分
		//注意：月份(month)从0开始数
		//硬编码  幻数
		c.set(Calendar.YEAR, 1999);
		c.set(Calendar.MONDAY, 0);
		c.set(Calendar.DATE, 22);
		c.set(Calendar.HOUR_OF_DAY, 14);
		c.set(Calendar.MINUTE, 22);
		c.set(Calendar.SECOND, 22);
		//c.set(1999, 0, 22, 14, 22, 22);
		//c.set(1999, 1, 20);
		
		Date now=c.getTime();
		
		System.out.println(now);
	}

}
