package com.syntax.class08;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		Scanner inp= new Scanner(System.in);
		
String done="null"; int a=0;
System.out.println("Welcome to Kwik-E-Mart");
while(!done.equalsIgnoreCase("n")) {System.out.print("Product name: "); String product=inp.nextLine(); 
                                    System.out.print("Price of product: £"); int price=inp.nextInt();
                                    System.out.println("Total amount due: £"+(a+=price));
                                    System.out.print("Continue shopping?(Y/N)"); done=inp.next(); inp.nextLine();      
                                    while(!done.equalsIgnoreCase("y") && !done.equalsIgnoreCase("n") ) {
                                    	 System.out.println("Invalid input? - Please enter 'Y' or 'N'"); done=inp.next(); inp.nextLine(); }}
                                    

                     System.out.print("Enter amount you are paying: "); int paid=inp.nextInt();
                     System.out.println("Thanks for shopping at Kwik-E-Mart. Your change is £"+(paid-a));


	}

}
