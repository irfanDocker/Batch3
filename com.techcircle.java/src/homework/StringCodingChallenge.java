package homework;

import java.util.Arrays;
import java.util.Scanner;

public class StringCodingChallenge {

	public static void main(String[] args) {
//		/*
//		 * Task 1:
//		 * 
//		 * Write a Java program to find the middle character of a string. If the length
//		 * of the string is odd there will be one middle character. b) If the length of
//		 * the string is even there will be 2 middle characters. Test Data: Input a
//		 * string: abcde Expected Output: c Input a string: car11car Expected Output: 11
//		 */
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Type a String");
//
//		String input = scanner.nextLine();
//
//		if (input.length() % 2 == 0) {
//			// length of the input is even
//			// there will be 2 middle characters
//
////			String test = "car11car";
//////			               01234567 
////			
////			System.out.println(test.length()/2 -1);
////			System.out.println(test.length()/2);
//
//			// you can use substring
//			// you can use charAt method
//
////			System.out.print(input.charAt(input.length()/2 -1));
////			System.out.print(input.charAt(input.length()/2));
//
//			System.out.println(input.substring(input.length() / 2 - 1, input.length() / 2 + 1));
//
//		} else {
//			System.out.println(input.charAt(input.length() / 2));
//		}
//
//		scanner.close();

		// Queensy
//		String word = "alphabe";
//		if (word.length()%2 ==1) {
//			System.out.println(word.charAt((word.length()-1)/2));
//		}else {
//			System.out.print(word.charAt(word.length()/2-1));
//			System.out.println(word.charAt(word.length()/2));
//		}
//		
//		String str = "The quick brown fox jumps over the lazy dog.";
//		System.out.println(str.replace("dog", "cat"));

//		String str = "Pizza";
//		if (str.length()<5) {
//			for (int x = str.length(); x<5; x++) {
//				str = str+"o";
//			}
//		}
//		else if (str.length()>5) {
//			str = str.substring(str.length()-5, str.length());
//		}
//		
//		System.out.println(str);

		// Sorting an array
//		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
////                            0      1     2     3  
//		String[] my_array2 = { "Java", "JDBC", "SQL", "Junit", "Selenium", "Jenkins", "Cucumber", "Agile", "SDLC",
//				"WebDriver" };
//		
//		Arrays.sort(my_array1);
//		
//		int lastIndex = my_array1.length -1;
//		int min = my_array1[0];
//		int max = my_array1[lastIndex]	;	
//		
//		System.out.println(min);
//		
//		System.out.println(max);

//		System.out.println(Arrays.toString(my_array1));
//		Arrays.sort(my_array1);
//		System.out.println(Arrays.toString(my_array1));
//
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
//
//		System.out.println(Arrays.toString(my_array2));
//		Arrays.sort(my_array2);
//		System.out.println(Arrays.toString(my_array2));
////		System.out.println(Arrays.toString(my_array1));
//		System.out.println(Arrays.toString(my_array2));

		/*
		 * Task 5: Write a Java program to find index of Jenkins before sorting and
		 * after sorting. String[] my_array2 = { "Java",
		 * 
		 * “JDBC”, “SQL”, “Junit”, “Selenium”, “Jenkins”, “Cucumber”, “Agile”, “SDLC”,
		 * “WebDriver”
		 * 
		 * };
		 */

		//

//		Arrays.sort(my_array2);;
//		int index;
//		for (index = 0; index < my_array2.length; index++) {
//			if (my_array2[index] == "Jenkins") {
//				break;
//			}

//		}
//		System.out.println("Index of Jenkins : "+index);

//		boolean number2019Exist = false;
//		boolean number2013Exist = false;
		// Loop the array 1
		// check if 2019 contain in the array

//		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };
//		// String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
//
//		int[] new_array = new int[my_array.length];
//		int z = 0;
//		for (int x = 1; x < my_array.length; x++) {
//			//System.out.println("outer loop iteration <"+x+"> : "+my_array[x]);
//			for (int y = 0; y < x; y++) {
//				//System.out.println("Inner loop iteration <"+y+"> : "+my_array[y]);
//				if (my_array[x] == my_array[y]) {
//					new_array[z] = my_array[x];
//					z++;
//					break;
//				}
//			}
//		}
//		int[] final_array = new int[z];
//		for (int x = 0; x < z; x++) {
//			final_array[x] = new_array[x];
//		}
//
//		System.out.println(Arrays.toString(final_array));

		String str = "12abc3d987987sd7fs98d7fsd9f87sd9f87sdf98s7df98s4e5f";
//		String array = "0123456789";
//		for (int x = 0; x < str.length(); x++) {
//			boolean z = true;
//			for (int y = 0; y < 9; y++) {
//				if (str.charAt(x) == array.charAt(y)) {
//					
//					System.out.println();
//					z = false;
//					break;
//				}
//			}
//			if (z) {
//				System.out.print(str.charAt(x));
//			}
//		}
		
		
		int num0 = '0';
		int num9 = '9';
		int num22 = '!';
		
		
		
		char nine = 57;
		
		System.out.println(nine);
		
		
		System.out.println(num22);
		
		String a = "";
		for (int i = 0 ; i < str.length(); i ++) {
			//System.out.println(str.charAt(i));
			
			
			if (str.charAt(i) >= num0 && str.charAt(i) <=num9) {
				a += str.charAt(i);
			}
			
		}
		
		
		System.out.println(a);
		
		
		
		

	}

}
