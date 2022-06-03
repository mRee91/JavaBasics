package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {


		//creating scanner
		Scanner input=new Scanner(System.in);
		//send instruction to console
		System.out.println("PLease enter your name");
		//grabbing values from console
		String name=input.next();
		//System.out.println(name);
		
		System.out.println(name+" Please enter your age ");
		int age=input.nextInt();
		System.out.println(name+" is "+age+" years old");
		
		
		
	}

}
