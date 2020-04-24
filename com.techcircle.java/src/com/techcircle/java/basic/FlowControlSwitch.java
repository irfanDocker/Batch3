package com.techcircle.java.basic;

import java.util.Scanner;

public class FlowControlSwitch {
	public static void main(String[] args) {

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

//		char grade = 'S';
//		switch (grade) {
//		case 'A':
//		case 'B':
//		case 'C':
//		case 'D':
//			System.out.println("Pass");
//			break;
//		case 'W':
//			System.out.println("Withdraw");
//			break;
//		case 'I':
//			System.out.println("Incomplete");
//			break;
//		default:
//			System.out.println("Fail");
//		}

//		String operator = "*";
//		
//		int num1= 10;
//		int num2 = 20;
//		int total = 0;
//	
//		switch (operator) {
//		case "+":
//			total = num1 + num2;
//			break;
//		case "-":
//			total = num1 - num2;
//			break;
//		case "*":
//			total = num1 * num2;
//			break;
//		case "/":
//			total = num1/num2;
//			break;
//		default:
//			System.out.println("Invalid operator");
//			break;
//			
//		}
//		
//		System.out.println("num1 " + operator +" num2 = "+ total );

		
		//Zaineb
//		int bathTemperature = 200;
//
//		if (bathTemperature < 95) {
//			System.out.println("That is lukewarm");
//		} else if (bathTemperature < 105) {
//			System.out.println("Perfect");
//		} else if (bathTemperature < 110) {
//			System.out.println("This is not hot tub");
//		} else {
//			System.out.println("fail");
//		}
		
		

		// Queensy
		int bathTemperature = 89;

		switch (bathTemperature) {
		case 88:
		case 89:
			System.out.println("Brrr!");
			break;
		case 90:
		case 91:
		case 92:
		case 93:
		case 94:
			System.out.println("That's lukewarm.");
			break;
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
		case 101:
		case 102:
		case 103:
		case 104:
			System.out.println("Perfect!");
			break;
		case 105:
		case 106:
		case 107:
		case 108:
		case 109:
			System.out.println("This isn't a hot tub");
			break;
		case 110:
			System.out.println("Are you trying to boil a lobster?");
			break;

		}

	}
}
