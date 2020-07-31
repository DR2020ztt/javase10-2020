package com.neuedu.test.chapter4;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//二分查找
		int[] arr={1,2,6,9,13,55,88};
		 int key=13;
		 int low=0;
		 int high=arr.length-1;
		 int locale=-1;
		  while(low<=high)
		  {
			  //找中间位置
			  int mid=(low+high)/2;
			  if(key>arr[mid])
			  {
				  low=mid+1;
			  }
			  else if(key<arr[mid])
			  {
				  high=mid-1;
			  }
			  else
			  {
				  locale=mid;
				  break;
			  }
		  }
		  if(locale==-1)
		  {
			  System.out.println("没找到");
		  }
		  else
		  {
			  System.out.println("找到了，下标在"+locale);
		  }
	}

}
