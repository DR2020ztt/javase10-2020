package com.neuedu.test.chapter9;
/*
 * 打印当前月日历
 * 日	一	二	三	四	五	六
							1	
	2	3	4	5	6	7	8	
	9	10	11	12	13	14	15	
	16	17	18	19	20	21	22	
	23	24	25	26	27	28	29	
	30	31
 */
import java.util.Calendar;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, 1);
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		//当月一共有多少天
		int maxDay = c.getActualMaximum(Calendar.DATE);
		
		//打印头
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//打印开头的空白
		for(int i=1;i<day;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=maxDay;i++){
			System.out.print(i+"\t");
			
			//打印换行
			if((day + i -1)%7==0){
				System.out.println();
			}
				
		}

	}

}
