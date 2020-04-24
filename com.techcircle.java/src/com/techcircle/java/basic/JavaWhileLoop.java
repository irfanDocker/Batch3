package com.techcircle.java.basic;

import java.util.Scanner;

public class JavaWhileLoop {

	public static void main(String[] args) {
		
//		int i = 0;
//		
////		if (i < 5) {
////			System.out.println(" i < 5 ");
////		}
//		
//		while (i < 5) {
//			System.out.println("Value of < i > is = " + i);
//			i++;
//		}
		
//		int x = 10;
//		int y = 20;
//		
//		while(x < y) {
//			System.out.println("Value of x "+ x);
//			x++;
//		}
		
		
//		int count,number;
//		
//		System.out.println("Enter a number");
//		
//		Scanner keyboard = new Scanner(System.in);
//		
//		number = keyboard .nextInt();
//		
//		 count = 1;
//		 
//		 while (count < number) {
//			 
//			 System.out.print(count + ", ");
//			 count++;
//			 
//		 }
//		System.out.print(number + ".");
//		System.out.println();
//		
//		System.out.println("Buckle by shoe.");
//		
//		keyboard.close();
		
		
		
		int count,number;
		
		System.out.println("Enter a number");
		
		Scanner keyboard = new Scanner(System.in);
		
		number = keyboard .nextInt();
		
		 count = 1;
		 
		 while (count <= number) {
			 
			if (count == number) {
				System.out.print(count+".");
			}else {
				System.out.print(count + ", ");
			}
			 
			 count++;
			 
		 }

		System.out.println();
		
		System.out.println("Buckle by shoe.");
		
		keyboard.close();
		
		
		
		

	}

}
