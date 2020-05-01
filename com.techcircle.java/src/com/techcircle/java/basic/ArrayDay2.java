package com.techcircle.java.basic;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

public class ArrayDay2 {

	public static void main(String[] args) {

		String car = "BMW";
		String car2 = "Opel";
		String car3 = "Ford";

//		String[] cars;
		// elements 1 2 3 4 5 6 7 8
		String cars[] = { "BMW", "Opel", "Ford", "Toyota", "Audi", car, car2, car3 };
		// index 0 1 2 3 4 5 6 7

//		System.out.println(cars[4]);

		cars[4] = "Honda";

//		System.out.println(cars[4]);
//		
//		System.out.println(cars.length);

//		System.out.println(cars[cars.length - 1]);

//		int index = 0;
//		while(index < cars.length) {
//			System.out.println("cars["+index+"] = "+cars[index]);
//			index++;
//		}
//		
//		int i = 0;
//		do {
//			System.out.println("cars[" + i + "] = " + cars[i]);
//			i++;
//		} while (i < cars.length);

//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}
//		
//		for (int i= 1 ; i <11 ; i++) {
//			System.out.println(i);
//		}

		// Reverse an array

//		int intArr[] = {1,2,3,4};

//		int[] result = new int[list.length];
//
//		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
//		      result[j] = list[i];
//		   }
//
//		   System.out.println("Original Array : "+ Arrays.toString(list));
//		   System.out.println("Reversed array : "+Arrays.toString(result));

//		int resultArr[] = reverse(intArr);
//		System.out.println(Arrays.toString(resultArr));
//
//		
//		print1to10();
//		print1to10();
//		print1to10();	print1to10();	

		// Sorting an array

		// Arrays

//		int numbers[] = {4,2,98,44,55,66,22,4,5,1,90};
//		
//		int numbers2[] = {90,2,98,44,55,66,22,4,5,1,4};

//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
//		Arrays.sort(numbers);
//		
//		System.out.println(Arrays.toString(numbers));
//		 
//		
//		System.out.println("original cars array :"+ Arrays.toString(cars));
//		Arrays.sort(cars);
//		System.out.println("Sorted cars array: "+ Arrays.toString(cars));
//		
//		System.out.println(Arrays.equals(numbers,numbers2));
//		
//		Arrays.sort(numbers);
//		Arrays.sort(numbers2);
//		boolean result = Arrays.equals(numbers,numbers2);
//		System.out.println(result);

		// Searching element in an array
		int numbers3[] = { 4, 2, 98, 44, 55, 66, 22, 4, 5, 1, 90 };

//		boolean isFound = false;
//		
//		for(int i = 0 ; i < numbers3.length ; i++) {
//			if(numbers3[i] == 55) {
//				isFound = true;
//				break;
//			}
//			System.out.println(i);
//		}
//		
//		if (isFound == true)
//			System.out.println("Item found!!");

		// This method searches a range of the specified array for the specified object
		// using the binary search algorithm.

		// Get the Array
		
//		int intKey = 55;
//
//		Arrays.sort(numbers3);
//		
//		System.out.println(Arrays.toString(numbers3));
//		System.out.println(intKey + " found at index = " + Arrays.binarySearch(numbers3, intKey));
		
		
		int[][] nums = {{9,1,1},{2,2,2,2,2,22,2},{3,2,22,2,2,2,3,2,22,333}};
		
//		System.out.println(nums[0][1]);
//		System.out.println(nums[1][5]);
//		System.out.println(nums[2][9]);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
			for(int j = 0 ; j < nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
		
		
		///System.out.println(Arrays.deepToString(nums[0][0]));
		
		
		// Array with duplicate elements
        Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };
 
        // This array has duplicate elements
        System.out.println(Arrays.toString(origArray));
 
        Integer[] tempArray = removeDuplicates(origArray);
 
        // Verify the array content
        System.out.println(Arrays.toString(tempArray));
		
		
		
		
		
		
		
		
		
		

	}

	
	
	 private static Integer[] removeDuplicates(Integer[] origArray) {
		 
	        Integer[] tempArray = new Integer[origArray.length];
	         
	        int indexJ = 0;
	        for (int indexI = 0; indexI < origArray.length - 1; indexI++) 
	        {
	            Integer currentElement = origArray[indexI];
	             
	            if (currentElement != origArray[indexI+1]) {
	                tempArray[indexJ++] = currentElement;
	            }
	        }
	         
	        tempArray[indexJ++] = origArray[origArray.length-1];
	         
	        return tempArray;
	    }
	
	public static void print1to10() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

}
