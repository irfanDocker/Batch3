package test;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
//		System.out.println("Irfan".charAt(0));
//		
//		char firstChar = "Irfan".charAt(2);
//		
//		System.out.println(firstChar);
//		
//		String name = "TechCircle";
//		
//		System.out.println(name.charAt(0));
		
		
//		String str  = "Hello";
//		
//		String str2 = " TechCircle";
//		
//		String str3 = str+str2;
//		
//		System.out.println(str3);
//		
//		String str4 = "Hello TechCircle";
//		
//		System.out.println(str4);
//		
//		boolean result = str3 == str4;
//		
//		System.out.println(result);
//		
		
//		String word = "java";
//		
//		System.out.println(word);
//		
//		System.out.println(word.toUpperCase());
//		
//		System.out.println(word.substring(2));
//		
//		String name = "TechCircle";
//		
//		String name2 = name.substring(4);
//		
//		System.out.println(name2);
//		
//		String name1 =name.substring(0, 4);
//		
//		System.out.println(name1);
		
/*		
		//Task split below string to two string and make it upper case
		
		String str = "HelloWorld";
		
//		String str1  = str.substring(0, 5).toUpperCase();
//		String str2 = str.substring(5).toUpperCase();
//		
//		System.out.println(str1);
//		System.out.println(str2);
		
		
//		String str1  = str.substring(0, 5);
//		String str2 = str.substring(5);
//		
//		System.out.println(str1.toUpperCase());
//		System.out.println(str2.toUpperCase());
		
		
		String word = "java";
		
		
		char firstChar = word.charAt(0);
		
		System.out.println(firstChar);
		
		String c = Character.toString(firstChar).toUpperCase();
		
		System.out.println(c);
		
		String newStr  = c + word.substring(1);
		
		System.out.println(word);
		System.out.println(newStr);
		
		
		System.out.println("length of "+word+" :" + word.length());
		
	
		System.out.println("length of "+str+" :"+ str.length());
		
		///Create empty string
		String emptyStr = "";
		
		String emptyStr2 = new String();
		
		System.out.println(emptyStr.length());
		System.out.println(emptyStr2.length());
		
		*/
		
		//String Part2
		/*
		char arr[] = {'j','a','v','a','a','v','a','a','v','a','a','v'};
		
		String strOfCharArr = new String(arr);
		
		System.out.println(strOfCharArr);
		
		System.out.println(strOfCharArr.length());
		
		System.out.println(strOfCharArr.charAt(1));
		
		System.out.println(strOfCharArr.charAt(2));
		
		System.out.println(strOfCharArr.charAt(3));
		
		System.out.println(strOfCharArr.charAt(strOfCharArr.length()-1));
		
		*/
		
		//Methods - concatination
		/*
		String word1 = "Re";
		String word2 = "think";
		String word3 = "ing";
		int num = 2;
		
		//String result = word1 + word2 +word3 +num;
		
		String result = word1.concat(word2).concat(word3);
		
		//result.concat(num);
		
//		result +=num;
		
		System.out.println(result);
		
		result = result +num;
		
		System.out.println(result);
		
		//result = Rethinking2;
		
		int index = result.indexOf(2);
		
		System.out.println(index);
		*/
		
		//String equals
		
		/*
		String str  = "Hello";
		
		String str2 = " TechCircle";
		
		String str3 = str.concat(str2);
		
		System.out.println(str3);
		
		String str4 = "Hello TechCircle";
		
		System.out.println(str4);
		
		boolean result = str3 == str4;
		
		System.out.println("Comparing 2 string using == : "+result);
		
		System.out.println("Comparing 2 string using equals method : "+str3.equals(str3));
		
		
		String str5 = "hello TECHCIRCLE";
		
		System.out.println("Comparing 2 string using equals method : "+str3.equals(str5));
		
		System.out.println("Comparing 2 string using equalsIgnoreCase method : "+str3.equalsIgnoreCase(str5));
		*/
		
		
		//Comparing 2 string
		/*
		String str1 = "hello";
		
		String str2 = "hello";
		
		System.out.println(str1.compareTo(str2));
	
		
		String str3 = "hellO";
		
		System.out.println(str1.compareTo(str3));
		
		
		String str4 = "JAVA";
		
		System.out.println("String4 : "+str1.compareTo(str4));
		
		*/
		
		//Trim
		/*
		String str = "                hello               ";
		
		System.out.println(str.length());
		
		str = str.trim();
		
		System.out.println(str.length());
		
		String str1 = "TechCircle        ";
		System.out.println(str1.length());
		
		System.out.println(str1.trim().length());
		
		*/
		
		
		//Replace
		/*		String word1 = "car";
		
		String word2 = word1.replace('r','t');
		
		System.out.println(word2);
		
		String word3 = word2.replace("at", "ow");
		
		System.out.println(word3);
		*/
		
		
		//Converting number to string
		
		//#1
		
		int num = 99;
		
		String str = "";
		
		str +=num;
		
		System.out.println(str);
		
		//#2 using wapper class or helper class
		
		/*
		 * int  Integer
		 * shor Short
		 * byte Byte
		 * long Long
		 * double Double
		 * float Float
		 * boolean Boolean
		 * */
		
		double price = 99.99d;
		
		String strPrice = Double.toString(price);
		
		System.out.println(strPrice);
		
		long longVal = 20202020L;
		
		//#3 valueOf()
		
		float pi = 3.14f;
		
		String str3 = String.valueOf(pi);
		
		System.out.println(str3);
		
		
		String city = "Bloominton";
		
		System.out.println(city.indexOf('o'));
		
		System.out.println(city.lastIndexOf('o'));
		
		System.out.println(city.indexOf(3));
		
		System.out.println("sam".compareTo("Sam"));
		
		
		
		
		//
		
		String stra = "The quick brown fox jumps over the lazy dog.";
		System.out.println(stra.replace("dog", "cat"));



		
		/*
		 * 
		 * Task 3:

			Write a program that checks length of the string. If string length is  less than 5 character  then add  any character and make it total five chars.
			if length is equal to 5 than keep original string. 
			if string length greater than 5 character then keep last 5 character .
			Examples:
			String str1 = "computer"; String str2 = "Java"; String str3 = "Pizza";
			//expected     “puter” ,                           “JavaA”                   “Pizza”
			*/
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a string");

		String input = scanner.nextLine();
		
		if(input.length()< 5) {
			
			//add chars to make it total 5 chars
			while(input.length() < 5) {
				input += "o";
			}
			
		}
		
		if (input.length()>5) {
			//keep last 5 chars
			input = input.substring(input.length()-5);
		}
		
		if (input.length() == 5) {
			//keep the string
			//System.out.println(input);
		}
		
		System.out.println(input);
		
//		
		
//		Clean code 
		//String str = "alphabet";
//		if (input.length()<5) {
//			for (int x = input.length(); x<5; x++) {
//				input = input+"o";
//			}
//		}
//		else if (input.length()>5) {
//			input = input.substring(input.length()-5, input.length());
//		}
//		
//		System.out.println(input);
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
