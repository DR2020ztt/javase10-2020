package com.neuedu.test.chapter9;

public class TestString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aa   bb cc      dd";
		  
		// \s�հ� \d����
		String[] arr=str.split("\\s+");//�հ��ַ����зָ�,/s�հ��ַ���+��ʾ���
		//String[] arr=str.split("\\.");//������ʽ\.����.
		//String[] arr=str.split("\\d");//��һ��\->ת���ַ���\d��������
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
		
		//��ȡ�ַ���
		String s1="abcdefg";
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,5));//������ͷ����������βcde
		
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
