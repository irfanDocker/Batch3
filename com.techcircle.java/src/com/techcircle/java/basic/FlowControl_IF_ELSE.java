package com.techcircle.java.basic;

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
		int temperature = 85;

		boolean sunny = true;

		if (temperature > 90) { // int temperature
			if (sunny) // boolean sunny
				System.out.println("Beach");
			else
				System.out.println("Movie");
		} else {
			if (sunny)
				System.out.println("Tennis");
			else
				System.out.println("Soccer");
		}
	}

}
