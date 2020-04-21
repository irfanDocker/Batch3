package com.techcircle.java.basic;

import java.util.Scanner;

public class LearningScanner {
	public static void main(String[] args) {
		
		Scanner zaineb = new Scanner(System.in);
		
		System.out.println("Please type some number");
		
		int value = zaineb.nextInt();
		
		System.out.println("Your value is : "+value);
		
		
		zaineb.close();
		
	}
}
