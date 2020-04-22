package com.techcircle.java.basic;

import java.util.Scanner;

public class FlowControl_IF_ELSE {

	public static void main(String[] args) {

//		int count = 2;
//		int total = 4;
//		
//		if(count < 3) {
//			total = 0;
//			count = 0;
//			System.out.println("You can add many statement inside of the code block {}");
//			if (total == 0) {
//				count = 100;
//				
//			}
//			
//		}else {
//			total = total + count;
//		}
//		System.out.println("Value of total is "+total);
//		
//		System.out.println("Value of count is "+count);

		// Nested If statement

		// ssss
		// sdfss

		/*
		 * if (temperature > 90) // int temperature if (sunny) // boolean sunny
		 * System.out.println(“Beach”); else System.out.println(“Movie”); else if
		 * (sunny) System.out.println(“Tennis”); else System.out.println(“Soccer”);
		 */

		// Ctrl + Shift +F
//		Scanner obj = new Scanner(System.in);
//
////		int temperature = 85;
//		System.out.println("What is the temperature?");
//		int temperature = obj.nextInt();
//
//		System.out.println("Is sunny today?");
////		boolean sunny = true;
//		boolean sunny = obj.nextBoolean();
//
//		if (temperature > 90) { // int temperature
//			if (sunny) { // boolean sunny
//				System.out.println("Beach");
//			} else {
//				System.out.println("Movie");
//			}
//		} else {
//			if (sunny) {
//				System.out.println("Tennis");
//			} else {
//				System.out.println("Soccer");
//			}
//		}
//
//		obj.close();
//
//		int score;
//		char grade = 'F';
//
//		System.out.println("Enter your score: ");
//
//		Scanner scanner = new Scanner(System.in);
//
//		score = scanner.nextInt();
//
//		if ((score >= 90) && (score <= 100)) {
//			grade = 'A';
//		} else if (score >= 80 && score < 90) {
//			grade = 'B';
//		} else if (score >= 70 && score < 80) {
//			grade = 'C';
//		} else if (score >= 60 && score < 70) {
//			grade = 'D';
//		} else if (score >= 0 && score < 60) {
//			grade = 'F';
//
//		} else {
//			System.out.println("invalid score");
//		}
//		System.out.println("Score = " + score);
//		System.out.println("Grade = " + grade);
//
//		scanner.close();

		
		//Queensy
//		Scanner greeting = new Scanner(System.in);
//
//		System.out.println("What hour is it?");
//		int time = greeting.nextInt();
//
//		if ((time >= 5) && (time < 12)) {
//			System.out.println("Good morning");
//		} else if ((time >= 12) && (time < 17)) {
//			System.out.println("Good afternoon");
//		} else if ((time >= 17) && (time < 24)) {
//			System.out.println("Good evening");
//		}
//
//		greeting.close();

		
		//Zaineb
		Scanner day = new Scanner(System.in);
		System.out.println("Please type first age");
		int time = day.nextInt();

		if ((time < 5) && (time == 12)) {
			System.out.println("good Moorning");
		} else if ((time > 12) && (time == 17)) {
			System.out.println("good afternoon");
		} else if ((time > 17) && (time == 24)) {
			System.out.println("good evening");
			day.close();
		}

	}

}
