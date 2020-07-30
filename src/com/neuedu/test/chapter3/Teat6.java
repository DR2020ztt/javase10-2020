package com.neuedu.test.chapter3;

public class Teat6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=95;
		//90-100优秀
		//80-89良好
		//70-79中等
		//60-69及格
		//60以下不及格
		if(score<0||score>100)
		{
			System.out.println("输入不合法");
			return;//结束方法
			/*
			 * 不用else，可以加return
*/		}
		
			switch(score/10)
			{
			case 9:
			case 10:
				System.out.println("优秀");
				break;
			case 8:
				System.out.println("良好");
				break;
			case 7:
				System.out.println("中等");
				break;
			case 6:
				System.out.println("及格");
				break;
			default:
				System.out.println("不及格");
				break;
				
				
			
		}
		
	}

}
