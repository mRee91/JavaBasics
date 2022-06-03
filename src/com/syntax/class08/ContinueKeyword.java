package com.syntax.class08;

import java.util.Scanner;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for (int i=1; i<=10; i++) {
			
		//	if(i==2 || i==5) {continue; } // it skips everything below and reloops
		//	System.out.println(i+" ");
		//}
		Scanner inp= new Scanner(System.in);
		
		String done="null";
		
		
		while(!done.equalsIgnoreCase("y") && !done.equalsIgnoreCase("n") ) {
       	 System.out.println("Please enter 'Y' or 'N'"); 
       	 done=inp.next(); }
		
	
		
		
		
		
		
		
		
	}

}
