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

		// Queensy
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

		// Zaineb
//		Scanner day = new Scanner(System.in);
//		System.out.println("Please type first age");
//		int time = day.nextInt();
//
//		if ((time < 5) && (time == 12)) {
//			System.out.println("good Moorning");
//		} else if ((time > 12) && (time == 17)) {
//			System.out.println("good afternoon");
//		} else if ((time > 17) && (time == 24)) {
//			System.out.println("good evening");
//			day.close();
//		}

		/*
		 * Task 2: Nested if statement
		 * 
		 * Write a Java Program using nested if statement. Find the largest value
		 * between the 3 numbers below. n1 = -1.0 n2 = 4.5 n3 = -5.3
		 */

		// Zaineb
//		double n1 = 4.5;
//		double n2 = 4.5;
//		double n3 = -5.3;
//		if ((n1 > n2) && (n1 > n3) && (n1 !=n2)) {
//			
//		} else if ((n2 > n1) && (n2 > n3)) {
//			System.out.println("N2 is larger value");
//		} else if ((n3 > n1) && (n3 > n2)) {
//			System.out.println("N3 is the larger value");
//		} else {
//			System.out.println("All amount are the same value");
//		}

		// Queensy
//		double n1 = -1.0;
//		double n2 = -4.5;
//		double n3 = 5.3;
//		double largest;
//		
//		if (n1>n2) {
//			if (n1>n3) {
//				largest = n1;
//			}else largest = n3;
//		}else {
//			if (n2>n3) {
//				largest = n2;
//			}else largest = n3;
//		}
//		System.out.println("The largest number is "+largest);

		/*
		 * Task 3: 
		 Write a Java Program that prints the day of the week. 
		 Note : Your input is number 1 to 7. 
		 Example:
		 Input   : 1
         output  : Monday

		 * */
		
		
		
//		Scanner day = new Scanner(System.in);
//		System.out.println("Input number between 1 and 7.");
//		int number = day.nextInt();
//
//		switch (number) {
//		case 1:
//			System.out.println("Monday");
//			;
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			;
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			;
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		}
//		day.close();
		
		
		
//		Scanner day = new Scanner(System.in);
//		System.out.println("Input number between 1 and 7.");
		
//		int number = day.nextInt();	
		
		int number = 4;
		
		if (number == 1) {
			System.out.println("Monday");
		}else if (number == 2) {
			System.out.println("Tuesday");
		}else if (number == 3) {
			System.out.println("Wednesday");
		}else if (number == 4 ) {
			System.out.println("Thursday");
		}else if (number == 5) {
			System.out.println("Friday");
		}else if (number == 6) {
			System.out.println("Saturday");
		}else if(number == 7 ) {
			System.out.println("Sunday");
		}else {
			System.out.println("Invalid number");
		}
		
		
//		day.close();
		
		
		

	}

}
