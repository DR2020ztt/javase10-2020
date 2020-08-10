package com.neuedu.test.chapter9;

public class TestEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email="ztt@qq.com";
		
		//包含@，包含.
		//@在.前面       @不能在开头       .不能在结尾    @和.之间要有内容
		
		if(email.indexOf("@")<=0)
		{
			System.out.println("输入不合法");
			return;
		}
		if(email.indexOf(".")<0 || email.indexOf(".")==email.length()-1)
		{
			System.out.println("输入不合法");
			return;
		}
		if(email.indexOf(".")-email.indexOf("@")<=1)
		{
			System.out.println("输入不合法");
			return;
		}
		System.out.println("输入合法");
			
	}

}
