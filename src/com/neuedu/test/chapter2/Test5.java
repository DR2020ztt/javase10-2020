package com.neuedu.test.chapter2;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		 * \r �ص����׸��ǵ�һ��
		 * \n ����
		 * 
		 * 
		 * ��eclipse�����У�����Ч��һ��
		 * 
		 * \b �˸�
		 * ��eclipse�����У����Բ�����
		 * 
		 * 
		 * 
		 * 
		 * 0-9��ʮ����48
		 * A-Z��ʮ����65
		 * a-z��ʮ����97
		 * */
		char a = 'a';
		char b = '��';
		char c = '\u4eAA';
		char d = '\t';
		char e = '\'';
		char f = '\\';
		char g = '\"';
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println('\b');
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		System.out.println("escape\\bchar");
	    System.out.println("escape\\tchar");
	    System.out.println("escape\\rchar");
	    System.out.println("escape\\nchar");
	    System.out.println("\\����б����\\");
	    System.out.println("\'���ڵ�������\'");
	    System.out.println("\"����˫������\"");
	    System.out.println("��û��˫����");
	    
	    
	    
	    boolean flag = true;
	    boolean flag2 = false;

	}

}
