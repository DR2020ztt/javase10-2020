package com.neuedu.test.chapter9;

public class TestString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aa   bb cc      dd";
		  
		// \s空白 \d数字
		String[] arr=str.split("\\s+");//空白字符进行分割,/s空白字符，+表示多个
		//String[] arr=str.split("\\.");//正则表达式\.代表.
		//String[] arr=str.split("\\d");//第一个\->转义字符，\d代表数字
		for(String item:arr)
		{
			System.out.println(item);
		}
		
		String str2="a1c2bc";
		
		
		
		String str3=str2.replace('a', 'h');
		System.out.println(str2);
		System.out.println(str3);
		
		String str4=str2.replace("ab", "hh");
		System.out.println(str4);
		
		String str5=str2.replaceAll("\\d", "h");
		System.out.println(str5);
		
		String str6=str2.replaceFirst("\\d", "h");
		System.out.println(str6);
		
		System.out.println(str2.toUpperCase());
		System.out.println(str2);
		
		System.out.println(str2.charAt(2));
		
		//截取字符串
		String s1="abcdefg";
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,5));//包含开头，不包含结尾cde
		
		String s2="  abc  abc  abc";
		System.out.println(s2.indexOf("abc"));//0
		System.out.println(s2.indexOf("abc",1));//3
		
		System.out.println(s2.lastIndexOf("abc"));//6
		
		System.out.println(s2.trim());
		System.out.println(s2.replace(" ",""));
		
		System.out.println(s2.length());
		
		s2.concat("haha");
		System.out.println(s2.concat("hahah"));
		
		System.out.println(s2+"AA");
		
	}

}
