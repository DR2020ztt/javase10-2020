package com.neuedu.test.chapter9;

public class TestString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="hello";
		String b="HELLO";
		
		//IgnoreCase不区分大小写的比较
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		//compareTo
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		
		//startsWith
		//endsWith
		System.out.println(a.startsWith("h"));
		System.out.println(a.endsWith("o"));
		
		//包含关系
		System.out.println(a.contains("o"));
		
		//查找子串出现的位置，找不到返回-1
		System.out.println(a.indexOf("o"));
	}

}
