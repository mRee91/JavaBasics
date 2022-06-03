package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
Scanner inp = new Scanner(System.in);


		
		char choice=inp.next().charAt(0);
		String meaning;
		
		switch (choice) {
		
		case 'Y': meaning="Yes"; break;   //no duplicate cases
		case 'M': meaning = "Maybe"; break;
		case 'N': meaning = "No"; break;
		default: meaning = "Unknown";   }
		
		System.out.println(meaning);
		
		
		

	}

}
