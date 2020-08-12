package com.neuedu.test.chapter10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<>();
		
		//map��Ŷ���
		//key�����ظ�(�ظ��򸲸�֮ǰ��value)
		//���򣬸���key�Ĺ�ϣ��(hashcode)�������λ��
		map.put(1, "AA");
		map.put(2, "BB");
		map.put(2, "CC");
		
		//
		System.out.println(map.get(2));
		System.out.println(map.size());
		
		//�������õ����е�Ԫ��
		//1.�ȵ�����key������key��Value
		Set<Integer> keys=map.keySet();
		Iterator<Integer> iter=keys.iterator();
		while(iter.hasNext())
		{
			Integer key=iter.next();
			String value=map.get(key);
			System.out.println(key+"-"+value);
		}
		
		//2.����ÿһ��key-value��
		Set<Entry<Integer, String>> entry=map.entrySet();
		Iterator<Entry<Integer, String>> iter2=entry.iterator();
		while(iter2.hasNext())
		{
			Entry<Integer, String> e= iter2.next();
			System.out.println(e);
			
		}
	}

}
