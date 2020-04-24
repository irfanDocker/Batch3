package com.techcircle.java.basic;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		
		
		int num = randomNumber.nextInt(10); //generate random number 0 ~ 10
		System.out.println(num);
		
//		int count = 10;
//		while(count > 0) {
//			System.out.println(randomNumber.nextInt(10000));
//			count --;
//		}
		
;//		int secretNumber=randomNumber.nextInt(199999900);
//		
//		System.out.println(secretNumber);
	}
}
