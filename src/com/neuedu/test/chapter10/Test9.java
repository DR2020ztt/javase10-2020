package com.neuedu.test.chapter10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test9 {

	//lamda±Ì¥Ô ΩforEach
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		//lamda
		list.forEach(item->{
			System.out.println(item);
		});
		
        Set<String> set=new HashSet<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		//lamda
		list.forEach(item->{
			System.out.println(item);
		});
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "AA");
		map.put(2, "BB");
		map.put(3, "CC");
		
		map.forEach((k,v)->{
			System.out.println(k+"-"+v);
		});
	}

}
