package com.neuedu.test.chapter9;

import java.io.UnsupportedEncodingException;

public class TestString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 字符集(unicode)：对应关系 字符与数 【存储浪费空间】
		 * 
		 * 字符编码：utf-8(变长,英文1个字符，中文3个字符),utf-6 
		 * 
		 * 中国：gbk(简体中文+繁体中文),gb2312(简体中文)->中文占2个字符(英文1个字符，中文2个字符)
		 */
		String str="neusoft中国";
		
		char[] cs=str.toCharArray();
		
		String str2=new String(cs);
		
		String str3=String.valueOf(cs);
		
		System.out.println(str3);
		
		//str->byte[]
		//byte[] arr=str.getBytes();
		byte[] arr=null;
		try {
			arr = str.getBytes("utf-8");//平台默认编码 [gbk]
			for(byte item:arr)
			{
				System.out.println(item);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//byte数组变回string
		String str4=new String(arr);
		
		System.out.println(str4);
		
	}

}
