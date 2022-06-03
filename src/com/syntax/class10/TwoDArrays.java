package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {

    int[] [] numbers=new int[3][4];   
    //row 1
    numbers[0] [0] = 10;
    numbers[0] [1] = 20;	
    numbers[0] [2] = 30;	
    numbers[0] [3] = 40;	
	// row 2	
    numbers[1] [0] = 1;
    numbers[1] [1] = 2;	
    numbers[1] [2] = 3;	       //this way if you leave any blank it will store 0
    numbers[1] [3] = 4;		  // unlike the next method of storing array elements
	// row 3	
    numbers[2] [0] = 9;
    numbers[2] [1] = 8;	
    numbers[2] [2] = 7;	
    numbers[2] [3] = 6;	
		
		System.out.println(numbers[1] [3]);
		
		System.out.println(numbers.length); // this is the length of rows
		
		int rows=numbers.length;   //   same sh**
		System.out.println(rows);  //
		
		//--------------colums
		
		
		System.out.println(numbers[0].length); // colunms
		
		int columns=numbers[0].length;
		System.out.println(columns);
		
		System.out.println("----------------------------");
		
		
		String  [] [] usa={   {"New York","Albany","Buffalo",},
				              {"Los Angeles","San Fracsisco","San Jose", "San Diego", "Redding"},
				              {"Miami", "Orlando","Niceville","Tampa"},
				              {"McLean","Richmond","Leesburg"}      };
				     
		System.out.println(usa[0][2]);
		
		//I want to see how many elements inside my first array
		System.out.println(usa[0].length);
		System.out.println(usa[1].length);
		
	} }
