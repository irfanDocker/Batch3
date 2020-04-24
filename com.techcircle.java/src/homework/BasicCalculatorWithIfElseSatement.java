package homework;

import java.util.Scanner;

public class BasicCalculatorWithIfElseSatement {

	public static void main(String[] args) {
		/*
		 * Create a basic calculator using if else statement. Note: Create a string
		 * variable name it operator. Create 3 numeric variable, total, num1 and num2
		 * and perform basic calculation.
		 */

//		String operator = "(";
//		int num1, num2, total;
//		num1 = 10;
//		num2 = 20;
//		total = 0;
//		boolean isValidOperator = true;
//		if (operator == "+") {
//			total = num1 + num2;
//		} else if (operator == "-") {
//			total = num1 - num2;
//		} else if (operator == "*") {
//			total = num1 * num2;
//		} else if (operator == "/") {
//			total = num1 / num2;
//		} else {
//			System.out.println("Invalid Operator");
//			isValidOperator = false;
//		}
//
//		if (isValidOperator)
//			System.out.println("Num1 " + operator + " num2 = " + total);

		Scanner Calculator = new Scanner(System.in);
		System.out.println("Inter a number");
		int Num1 = Calculator.nextInt();
		System.out.println("Inter a number");
		int Num2 = Calculator.nextInt();
		System.out.println("Inter your opration");
		System.out.println("(1 = + )( 2 = - )( 3 = *) ( 4 + /)");
		int Opration = Calculator.nextInt();
		switch (Opration) {
		case 1:
			System.out.println("Num1 + Num2 = " + (Num1 + Num2));
			break;
		case 2:
			System.out.println("Num1 - Num2 = " + (Num1 - Num2));
			break;
		case 3:
			System.out.println("Num1 * Num2 = " + (Num1 * Num2));
			break;
		case 4:
			System.out.println("Num1 + Num2 = " + (Num1 / Num2));
			break;
		}
		
		Calculator.close();

	}

}
