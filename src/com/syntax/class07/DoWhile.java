package com.syntax.class07;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String job;
		
		
		//int num=10, num1=1;
		
		//while(num<=3) {
		//	System.out.println(num+" ");  
		//	num++;}
		
		
		do {
			System.out.println("Did you get a job?");
			job=inp.nextLine();
			} while(!job.equalsIgnoreCase("yes"));  //Do while 1st executes the code and only then checks the condition

		System.out.println("Congrats!");
		
		System.out.println("----------------------------------");
		
		System.out.println("Did you get a job?");
		String ans=inp.nextLine();
		
		while(!ans.equalsIgnoreCase("yes")) {
			System.out.println("Did you get a job?");
			ans=inp.nextLine();     }
				
		System.out.println("Congrats");
		
		
		
		
	}

}
