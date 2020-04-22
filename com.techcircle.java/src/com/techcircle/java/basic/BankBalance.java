package com.techcircle.java.basic;

import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {
		double overdrawnPenalty = 8.0;
		double interstRate = 0.02;
		double balance;
		
		System.out.println("Enter your checking account balance : $");
		
		Scanner scanner = new Scanner(System.in);
		
		balance = scanner.nextDouble();
		
		System.out.println("Your original balance is $"+balance);
		
		if(balance >=0)
			balance = balance + (interstRate * balance)/12;
		else
			balance = balance - overdrawnPenalty;
		
		System.out.println("Your new balance is $"+balance);
		
		scanner.close();
		

	}

}
