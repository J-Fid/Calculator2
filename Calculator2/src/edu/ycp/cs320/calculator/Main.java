package edu.ycp.cs320.calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the calculator");
		System.out.println("Fasten your seatbelt!");
		
		int i, sum, guess;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an Integer please.");
		i = scan.nextInt();
		
		sum = i * 47;
		
		System.out.println("You entered " + i + ", and the result was " + sum + ". What is the other number?");
		
		guess = scan.nextInt();
		
		if(guess == 47)
			System.out.println("Correct!");
		else
			System.out.println("Nope!");
	}
}
