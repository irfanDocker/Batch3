package com.techcircle.java.basic;

public class FlowControl_IF_ELSE {

	public static void main(String[] args) {
		
		int count = 2;
		int total = 4;
		
		if(count < 3)
			total = 0;
		else
			total = total + count;
		
		System.out.println("Value of total is "+total);

	}

}
