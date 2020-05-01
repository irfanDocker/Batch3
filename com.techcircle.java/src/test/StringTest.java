package test;

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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
