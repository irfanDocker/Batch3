package com.techcircle.java.basic;

import java.util.Random;
import java.util.Scanner;

public class StringBuilderClass {

	public static void main(String[] args) {
		String palindrome = "Dot saw I was Tod";
//        int len = palindrome.length();
//        char[] tempCharArray = new char[len];
//        char[] charArray = new char[len];
//        
//        // put original string in an 
//        // array of chars
//        for (int i = 0; i < len; i++) {
//            tempCharArray[i] = 
//                palindrome.charAt(i);
//        } 
//        
//        // reverse array of chars
//        for (int j = 0; j < len; j++) {
//            charArray[j] =
//                tempCharArray[len - 1 - j];
//        }
//        
//        String reversePalindrome =
//            new String(charArray);
//        System.out.println(reversePalindrome);

		// StringBuilder sb = new StringBuilder(palindrome);

//		StringBuilder sb = new StringBuilder();
//
//		sb.append(palindrome);
//
//		sb.reverse();
//		
//		System.out.println(sb);

		// Reverse user input
//		Scanner scanner  = new Scanner(System.in);
//		
//		System.out.println("Enter a number");
//		
//		int num = scanner.nextInt();
//		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append(num);
//		
//		sb.reverse();
//		
//		System.out.println("Original number :" + num);
//
//		System.out.println("Reversed num : "+ sb);

		//
//		Random randomNumber = new Random();
//
//		int numPart2 = randomNumber.nextInt(999);
//		int numPart3 = randomNumber.nextInt(9999);
//		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append(703);
//		
//		sb.append("-");
//		
//		sb.append(numPart2);
//		
//		sb.append("-");
//		
//		sb.append(numPart3);
//		
//		System.out.println(sb.toString());
		
		
		String[] domains = { "Oracle", "Docker", "Amazon", "GitLab", "CircleCI", "Jenkins" };

		Random randomNumber = new Random();

		int a = randomNumber.nextInt(domains.length - 1);

		//System.out.println(domains[index]);
		
		
		int n = 10;

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb

			sb.append(AlphaNumericString.charAt(index));

		}

		sb.append("@");
		sb.append(domains[a]);
		sb.append(".com");
		System.out.println(sb.toString());


		
		
		
		
		
		
		

	}

}
