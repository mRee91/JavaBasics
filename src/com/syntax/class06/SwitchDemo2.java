package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {


		
		Scanner inp=new Scanner(System.in);
		
		String country, favFood;
		
		System.out.println("Where you from?");
		country=inp.nextLine();
		
		switch (country.toLowerCase()) { /// if case sensitive like this, then all case should also be same case type
		case "turkey": favFood="Iskender"; break;
		case "mexico": favFood="Tacos"; break;
		case "canada": favFood="Poutine"; break;
		case "pakistan": favFood="Pati Chai"; break;
		case "egypt": favFood="Koshary"; break;
		case "usa": favFood="Burgers"; break;    
		default: favFood="Unknown";                   }
		
		System.out.println("Buy me some "+favFood+" Please.");
		
		//_________________________________________________________
		
		double price = 10;
		
		// switch(price) //double doesnt work on switch case
		 // also boolean
		   //cant use logical operators i.g case 'Turkey' || turkey :
		     // 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
