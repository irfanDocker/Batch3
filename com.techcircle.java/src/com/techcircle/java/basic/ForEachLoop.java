package com.techcircle.java.basic;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		String car = "BMW";
		String car2 = "Opel";
		String car3 = "Ford";

//		String[] cars;
		// elements 1 2 3 4 5 6 7 8
		String cars[] = { "BMW", "Opel", "Ford", "Toyota", "Audi", car, car2, car3 };

//		for(String a : cars) {
//			//System.out.println(a);
//		}
//		
//		
//		int[] numbers = {1,2,3,2,1,23,3,2};
//		
//		for (int a: numbers) {
//			System.out.println(a);
//		}
//		
//		boolean results[] =  {true, false,true,true};
//		
//		for (boolean b : results) {
//			System.out.println(b);
//		}

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
//		for (int i = 0; i < myNumbers.length; ++i) {
//			for (int j = 0; j < myNumbers[i].length; ++j) {
//				System.out.println(myNumbers[i][j]);
//			}
//		}
		
		
		for (int i = 0; i < myNumbers.length; i++) {
			System.out.println(Arrays.toString(myNumbers[i]));
			for (int j = 0; j < myNumbers[i].length;j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
//		for (int j = 0; j < myNumbers[1].length;j++) {
//			System.out.println(myNumbers[1][j]);
//		}

	}

}
