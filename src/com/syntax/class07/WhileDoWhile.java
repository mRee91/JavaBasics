package com.syntax.class07;

import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {

		Scanner inp=new Scanner(System.in);
		
		
		System.out.println("What is the capital of Turkey?");
		String cap=inp.nextLine();
		
		do {System.out.println("What is the capital of Turkey?");
		cap=inp.nextLine();}while(!cap.equalsIgnoreCase("istanbul"));
			
		
		String answ="null";
		while(!answ.equalsIgnoreCase("Harare")) {System.out.println("What is the capital of zimbabe?");
		answ=inp.next();}

		System.out.println("Congrats");
		
		
		
		
		
		
		
		

	}

}
