package com.techcircle.java.basic;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random randomNumber = new Random();

		int secretNumber = randomNumber.nextInt(10);//Generate Random number 0~10
		int usersNumber;
		int attempts = 1;
		System.out.println("Secret number is :"+secretNumber);
		System.out.println("Welcome to League of GuessNumbers");
		System.out.println("Your mission is to guess a secret number");
		System.out.println("You have 3 attempts");
		do {
			System.out.println("Your " + attempts + " attempt. Enter a number:");
			usersNumber = scan.nextInt();
			attempts++;
			if (usersNumber == secretNumber) {
				System.out.println("Congrats. Mission accomplished");
			} else if (usersNumber < secretNumber) {
				System.out.println("Too low. Try again");
			} else {
				System.out.println("Too high. Try again");
			}

			if (attempts > 3) {
				System.out.println("You could not guess in 3 attemps. Game over");
				break;
			}

		} while (usersNumber != secretNumber);

		System.out.println("Game Over. Secret Number:" + secretNumber);

	}
}
