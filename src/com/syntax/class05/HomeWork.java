package com.syntax.class05;

import java.util.Scanner;
public class HomeWork {  public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

    System.out.print("What amount of loan is needed mate? ");
    int loan=inp.nextInt();
    if (loan<=200000) System.out.println("OK mate! I will give you the loan.");
    else System.out.println("Sorry mate! No loan for you :'(");
    //__________________________________________________________________________
    
    System.out.print("input city: ");
    String city=inp.nextLine();
    System.out.print("input temperature: ");
    float temp=inp.nextFloat();
    temp = ((temp-32)*5)/9;
    System.out.println("The temperature in "+city+" is currently "+temp);
    //___________________________________________________________________________
    
    System.out.print("Enter worked years: ");
	int wy = inp.nextInt();
	System.out.print("What is your salary? ");
	int sl = inp.nextInt();
	 if (wy>4) {System.out.println("you are eligibale for a bonus");
	 if (sl>50000)System.out.println("bonus is 5000");
	 else System.out.println("bonus is 3000");
	 }else System.out.println("You are not eligible for a bonus");
	 //___________________________________________________________________________
	 System.out.print("Please enter current time: ");
	 float time=inp.nextFloat();
	 if (time>=1 && time<=11) System.out.println("Morning");
	 else if (time >=12 && time <= 15) System.out.println("Afternoon");
	 else if (time >=15.01 && time <= 20) System.out.println("Evening");	
	 else if (time >=20.01 && time <= 24) System.out.println("Night");
	 else System.out.println("invalid input!!!");
	 //____________________________________________________________________________
	 System.out.print("Please enter birth month: ");
	 String month=inp.next();
	 if (month.equals("March") || month.equals("April") || month.equals("May")) System.out.println("Spring");
	 else if (month.equals("June") || month.equals("July") || month.equals("August")) System.out.println("Summer");
	 else if (month.equals("September") || month.equals("October") || month.equals("November")) System.out.println("Autumn");
	 else if (month.equals("December") || month.equals("January") || month.equals("February")) System.out.println("Winter");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
