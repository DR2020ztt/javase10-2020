package com.neuedu.test.chapter6;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		//��������
		Student[] stus=new Student [5];
		
		
				
		for(int i=0;i<stus.length;i++)
		{
			
			System.out.println("�������"+(i+1)+"��ѧ������Ϣ");
			
			
			//next��������ֻ�տո�ǰ������
			//nextLine����һ������
			
			//�����û�����
			//System.in�ӿ���̨��ȡ
			//Scanner��bug,������������,��ô��Scanner���ŵ�ѭ���м�
			Scanner sc=new Scanner(System.in);

			String name=sc.nextLine();
			int sno=sc.nextInt();
			double score=sc.nextDouble();
			
			stus[i]=new Student(name,sno,score);
			/*stus[1]=new Student("s2",2,89);
			stus[2]=new Student("s3",3,98);
			stus[3]=new Student("s4",4,94);
			stus[4]=new Student("s5",5,92);*/
		}
			
		
		
		
		
		
		
		
		
		//����������
		for(int i=1;i<stus.length;i++)
		{
			for(int j=0;j<stus.length-i;j++)
			{
				if(stus[j].score<stus[j+1].score)
				{
					Student temp=stus[j];
					stus[j]=stus[j+1];
					stus[j+1]=temp;
				}
			}
		}
		
		//�����ǰ��ɼ��������е�
		for(Student item:stus)
		{
			System.out.println(item.name+"\t"+item.score);
		}
	}
}

class Student
{
	
	String name;
	int age;
	double score;
	
	public Student(String name,int age,double score)
	{
		this.name=name;
		this.age=age;
		this.score=score;
		
	}
}