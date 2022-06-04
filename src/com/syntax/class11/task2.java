package com.syntax.class11;

import java.util.Scanner;

public class task2 { public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		
	System.out.println("Please enter the size of the array that you want to create");
	
	int arraySize=inp.nextInt();
	
	String [] countryArray= new String[arraySize];
	
	for (int i=0; i<countryArray.length; i++) {
		countryArray[i]=inp.next();
	}
	
	
	for(String element:countryArray) {
		if(element.equalsIgnoreCase("usa")) {
			System.out.println("Washington DC");
		}else if(element.equalsIgnoreCase("turkey")) {
			System.out.println("Ankara");
	    }else if(element.equalsIgnoreCase("Thailand")) {
		    System.out.println("Bankok"); 
	    }else System.out.println("Country not supported by my program");
	
	
	
	
	
	
		
		
	 }}}
