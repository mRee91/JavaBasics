package com.syntax.class08;

import java.util.Scanner;

public class ShopAskingForMoreMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner inp= new Scanner(System.in);
		double paySum = 0;

System.out.print("Enter the item name you wish to buy: ");
String product=inp.next();
System.out.print("Nice choice! Do you know how much that costs? ");
double price=inp.nextDouble();
System.out.println("Thats right, please pay up!");


while(price>0) { 
	double pay=inp.nextDouble(); price-=pay; if(price>0)System.out.println("Thats only £"+pay); else {System.out.println("Thats £"+pay);}
	if(price>0)System.out.println("You need to pay me £"+(price)+" more!");
	else if(price==0) {System.out.println("Thats all of it. Thanks for shopping at Teapot Head");}
	else {System.out.println("Here is your change.. £"+(price*-1));}          }

System.out.println("Thanks for the payment mate.");

		
		
		
		

	}}