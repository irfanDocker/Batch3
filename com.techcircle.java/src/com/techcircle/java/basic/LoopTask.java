package com.techcircle.java.basic;

import java.util.Scanner;

public class LoopTask {

	public static void main(String[] args) {
//		int x = 20;
//		while (x < 31) {
//			System.out.println(x);
//			x++;
//		}

//		for (int x = 20; x < 31; x++) {
//			System.out.println(x);
//		}

//		int Number = 20;
//		int i = 30;
//		
//		while (Number <= i) {
//			System.out.println( Number);
//			Number++;
////			System.out.println(Number);
//		}

//		int count = 0;
//
//		do {
//			// System.out.println(count);
//			int i = 20;
//
//			i += count;
//			System.out.println(i);
//
//			count++;
//
//		} while (count < 11);

		// Calculate sum of 1 ~ 100
		int sum = 0;
		int a = 1;
		do {
			// System.out.println(a);
			sum += a;
			a++;
		} while (a <= 100);

//		int sum = 0;
//        int x=1;
//        while (x<101) {
//            sum += x;
//            x++;
//        }
//        System.out.println("The sum of 1 to 100 is "+sum);    

		// Queensy
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Please enter a positive integer.");
//        int integer = keyboard.nextInt();
//        int z = 0;
//        int product;
//        
//        while(z <= integer) {
//            product = z*integer;
//            // 5 X 1 = 5
//            System.out.println(integer+" X "+ z+" = " + product);
//            z++;
//        }
//        
//        keyboard.close();

//		int n, reverse = 0;
//		System.out.println("Enter an integer to reverse");
//		Scanner in = new Scanner(System.in);
//		n = in.nextInt();
//		while (n != 0) {
//			System.out.println("1 reverse : " + reverse);
//			reverse = reverse * 10;
//			System.out.println("2 reverse : " + reverse);
//			System.out.println("1 value of n : " + n);
//			reverse = reverse + n % 10;
//			System.out.println("n % 10 :" + n % 10);
//			System.out.println("4 reverse : " + reverse);
//			n = n / 10;
//			System.out.println("2 value of n : " + n);
//		}
//		System.out.println("Reverse of the number is " + reverse);
//
//		in.close();

		int number = 1;
		int even = 0;
		int odd = 0;

		while (number < 101) {
			if (number % 2 == 0) {
				even += number;
				// even = even + number;
			} else {
				odd += number;
			}

//			even = (number %2 ==0) ? even + number : even;
//			
//			odd = (number %2 ==1) ? odd + number : odd;

//			if(number % 2 == 0)
//				System.out.println(number);

			number++;
		}

		System.out.println("The sum of even numbers: " + even);
		System.out.println("The sum of odd numbers: " + odd);

	}

}
