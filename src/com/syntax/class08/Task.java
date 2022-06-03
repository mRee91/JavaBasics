package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		for (int i=1; i<=50; i++) {
			
			if(i%3==0) {continue; } // it skips everything below and reloops
			System.out.print(i+" "); }
		
		System.out.println(" ");//________________
		
		
			Scanner inp=new Scanner (System.in);
			String ans="null";
			while (!ans.equalsIgnoreCase("yes")) {
				System.out.println("Apply for the credit card!");
				ans=inp.next();
			}
		
	}

}
