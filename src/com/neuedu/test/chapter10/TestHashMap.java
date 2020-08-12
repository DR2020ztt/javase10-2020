package com.neuedu.test.chapter10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<>();
		
		//map里放东西
		//key不能重复(重复则覆盖之前的value)
		//无序，根据key的哈希码(hashcode)决定存放位置
		map.put(1, "AA");
		map.put(2, "BB");
		map.put(2, "CC");
		
		//
		System.out.println(map.get(2));
		System.out.println(map.size());
		
		//遍历，得到所有的元素
		//1.先得所有key，根据key得Value
		Set<Integer> keys=map.keySet();
		Iterator<Integer> iter=keys.iterator();
		while(iter.hasNext())
		{
			Integer key=iter.next();
			String value=map.get(key);
			System.out.println(key+"-"+value);
		}
		
		//2.遍历每一组key-value对
		Set<Entry<Integer, String>> entry=map.entrySet();
		Iterator<Entry<Integer, String>> iter2=entry.iterator();
		while(iter2.hasNext())
		{
			Entry<Integer, String> e= iter2.next();
			System.out.println(e);
			
		}
	}

}
