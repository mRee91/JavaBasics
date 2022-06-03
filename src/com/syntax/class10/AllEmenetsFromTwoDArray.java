package com.syntax.class10;

public class AllEmenetsFromTwoDArray {

	public static void main(String[] args) {



		
			String  [] [] usa={   {"New York","Albany","Buffalo",},
		              {"Los Angeles","San Fracsisco","San Jose", "San Diego", "Redding"},
		              {"Miami", "Orlando","Niceville","Tampa"},
		              {"McLean","Richmond","Leesburg"}      };
		     
System.out.println(usa[0][2]);

//I want to see how many elements inside my first array
System.out.println(usa[0].length);
System.out.println(usa[1].length);
		
		
		for (int row=0; row<usa.length; row++) {
			for(int col=0; col < usa[row].length; col++) {
				System.out.print(usa[row][col]+" ");    }
			                System.out.println();                 }
		
		
		
		
		
	}

}
