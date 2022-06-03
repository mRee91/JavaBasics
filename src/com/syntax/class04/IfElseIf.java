package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		
		int month=3;
		
		if (month==3)
			System.out.println("March");
		
		if(month<0)
			System.out.println("negative");
		else if (month==0)
			System.out.println("zero");
		else
			System.out.println("posotive");
		
		if (month == 1||month==3||month==5||month==7||month==9||month==11)
			System.out.println("odd");
		else
			System.out.println("even");
		
		
		
		
		
		

	}

}
