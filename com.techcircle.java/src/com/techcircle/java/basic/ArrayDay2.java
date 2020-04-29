package com.techcircle.java.basic;

public class ArrayDay2 {

	public static void main(String[] args) {
		
		String car = "BMW";
		String car2 = "Opel";
		String car3 ="Ford";
		
		
//		String[] cars;
		
		String cars[] =  {"BMW","Opel","Ford","Toyota","Audi",car,car2,car3};
		
//		System.out.println(cars[4]);
		
		cars[4] = "Honda";
		
//		System.out.println(cars[4]);
//		
//		System.out.println(cars.length);
		
		System.out.println(cars[7]);
		
		System.out.println(cars.length);
		
		System.out.println(cars[cars.length-1]);
		
		
		int index = 0;
		while(index < cars.length) {
			System.out.println("cars["+index+"] = "+cars[index]);
			index++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
