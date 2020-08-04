package com.neuedu.test.chapter6;

import java.util.Random;

public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card[] zp = new Card[52];
		String[] va = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (int i = 0; i < zp.length; i++) {
			if (i < 13) {
				zp[i] = new Card("ºìÌÒ", va[i % va.length]);
			} else if (i < 26) {
				zp[i] = new Card("·½Æ¬", va[i % va.length]);
			} else if (i < 39) {
				zp[i] = new Card("ºÚÌÒ", va[i % va.length]);
			} else {
				zp[i] = new Card("Ã·»¨", va[i % va.length]);
			}

		}
		
		for (Card item : zp) {
			System.out.println(item.face + "\t" + item.value);

		}
		
		Random r = new Random();
		for(int i=zp.length-1;i>0;i--){
			int j = r.nextInt(i);
			Card temp = zp[i];
			zp[i] = zp[j];
			zp[j] = temp;
		}
		for (Card it : zp) {
			System.out.println(it.face + "\t" + it.value);

		}
	}
}

class Card {
	String face;
	String value;

	public Card(String face, String value) {
		this.face = face;
		this.value = value;
	}
}
