package com.techcircle.java.basic;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
//		//String name = "TechCircle";
//		String[] names = {"Irfan","Shafkat"};
//		
//		//System.out.println(names[0]);
//		
//		String fruits[] = new String[6];
//		
//		fruits[0] = "Apple";
//		System.out.println(fruits[0]);
//		
//		fruits[3] = "Mango";
//		System.out.println(fruits[5]);
		
		
//		String fruits[] = new String[3];
//		fruits = {"apple", "orange", "mango"};
		
		//String fruits[] = {"apple", "orange", "mango"};
		//fruits = {"apple", "orange", "mango"};
		
		
		int scores[] = {1,2,3,4,5};
		
		System.out.println(scores[3]);
		
		scores[3] = scores[1] + scores[4];
		
		System.out.println(scores[3]);
		
		int intArr[] = { 10, 20, 15, 22, 35 };
		  
        Arrays.sort(intArr);
  
        int intKey = 22;
  
        System.out.println(intKey
                           + " found at index = "
                           + Arrays
                                 .binarySearch(intArr, intKey));


		
		
		
		
		
		
		
		
		
	}
}
