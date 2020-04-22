package com.techcircle.java.basic;

import java.util.Scanner;

public class LearningScanner {
	public static void main(String[] args) {
		
		Scanner zaineb = new Scanner(System.in);
		
		System.out.println("Please type some number");
		
		int value = zaineb.nextInt();
		
		int valueB = 5555;
		
		int result = value + valueB;
		
		double balance = zaineb.nextDouble();
		
		System.out.println("Your Result is : "+result);
		
		System.out.println("Your balance is : "+ balance);
		
		zaineb.close();
		
	}
}
