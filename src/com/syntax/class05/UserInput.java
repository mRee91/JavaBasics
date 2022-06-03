package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Please enter name");
        String name=inp.next(); // next(); captures first word -- 
        System.out.println(name);
        
        String fullname=inp.nextLine(); // nextLine(); captures more than one word
        System.out.println(fullname);
        
        System.out.println("Please enter age");
		int age=inp.nextInt();
		
		System.out.println("Please enter price");
		double price= inp.nextDouble();
		
		System.out.println("Please enter boolean");
		boolean boo=inp.nextBoolean();
		
		System.out.println("Please enter any charecter");
		char ch=inp.next().charAt(5);
		
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
