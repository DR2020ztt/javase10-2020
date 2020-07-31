package com.neuedu.test.chapter3;

public class Testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
	    for (int i = 1; i <= n; i++) {
	        if (n % i != 0)
	        continue;
	        System.out.print(i + ",");
	    }
	}

}
