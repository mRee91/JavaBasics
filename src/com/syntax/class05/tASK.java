package com.syntax.class05;

import java.util.Scanner;

public class tASK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner inp = new Scanner(System.in);

		System.out.println("Do you have a credit card");
		//boolean cc = inp.nextBoolean();
		String cc = inp.next();



		if (cc.equalsIgnoreCase("yes")) { // check here
			System.out.println("What is the balance of the card?");
			double balance = inp.nextDouble();

		if (balance > 1000) System.out.println("Pay off immedietly");
		else System.out.println("You can spend more");  }

		else if (cc.equalsIgnoreCase("no")) System.out.println("Whould you like to aquire a Credit Card ????");



		System.out.print("Enter worked years:");
		int wy = inp.nextInt();
		System.out.print("What is your salary? ");
		int sl = inp.nextInt();
		 if (wy>4) {System.out.println("you are eligibale for a bonus");
		 if (sl>50000)System.out.println("bonus is 5000");
		 else System.out.println("bonus is 3000");
		 }
		 
		 else System.out.println("You are not eligible for a bonus");
		
		
		
		
		
		
		
		
		
		
		
	}

}
