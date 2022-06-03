package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] nums= {{1,2,3,4,5},
				        {199,300,588},
				        {1900,4578,98787} };
		
		for(int i=0; i<nums.length; i++) {
			for(int b=0; b<nums[i].length; b++) {
				System.out.print(nums[i][b]+" ");  }   
			System.out.println();}
		
		System.out.println("--------Enhanced loop---------");
		
		for(int[] row:nums) {
			for(int colunm:row) {
				System.out.print(colunm+" ");  }   
			System.out.println();}
		
		//=====================================================
		
		System.out.println("---------Enhanced Lopp--------------");
		String  [] [] usa={   {"New York","Albany","Buffalo",},
	              {"Los Angeles","San Fracsisco","San Jose", "San Diego", "Redding"},
	              {"Miami", "Orlando","Niceville","Tampa"},
	              {"McLean","Richmond","Leesburg"}      };
		
		for (String[] state:usa) {
			for(String city:state) {
				System.out.print(city+", ");
			} System.out.println();
		}
		
		
	}  }
