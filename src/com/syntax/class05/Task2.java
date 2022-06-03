package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {


		Scanner inp = new Scanner(System.in);

		System.out.print("enter hieght in inches: ");
		int inch = inp.nextInt();

		if (inch<60) System.out.println("short");
		else if (inch>59 && inch < 73) System.out.println("mediuim");
		else System.out.println("tall");

		//_________________________________________________________________

		System.out.print("input day as number:");
		int day=inp.nextInt();
		 if (day==1 || day==2 || day==3 || day==4 || day==5) System.out.println("weekday");
		 else if (day==6 || day==7)System.out.println("weekend");
		 else System.out.println("Invalid Day");
		 
		 //__________________________________________________________________
		 
		 System.out.print("Enter a number: ");
		 int num =inp.nextInt();
		 
		 if (num>0 && num<11) System.out.println("small");
		 else if (num>11 && num<101) System.out.println("Medium");
		 else if (num>100 && num<1001) System.out.println("Large");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
