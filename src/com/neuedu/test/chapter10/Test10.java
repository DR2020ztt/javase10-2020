package com.neuedu.test.chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Stu> list=new ArrayList<>();
		
		list.add(new Stu("ACA",12,88));
		list.add(new Stu("ABB",45,90));
		list.add(new Stu("CC",23,78));
		
		//list中元素实现了Comparable接口
		Collections.sort(list);
		for(Stu s:list)
		{
			System.out.println(s.name+"\t"+s.age+"\t"+s.score);
		}
	}
	static class Stu implements Comparable<Stu>
	{
		String name;
		int age;
		double score;
		
		public Stu(String name,int age,double score)
		{
			this.name=name;
			this.age=age;
			this.score=score;
		}

		//提供比较规则 
		@Override
		public int compareTo(Stu o) {
			
			/*if(this.score>o.score)
			{
				return 1;
			}
			else if(this.score<o.score)
			{
				return -1;
			}
			return 0;*/
			
			return this.name.compareTo(o.name);
		}
	}


}
