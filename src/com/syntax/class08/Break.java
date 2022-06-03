package com.syntax.class08;

public class Break {

	public static void main(String[] args) {
		

		for (int n=20; n>=0; n--) {
			if (n%2==0)System.out.print(n+" "); 
			if (n==10)break; }
		
		boolean summer=true;
		int temp=25;
		while(summer) {
		
		if(temp<18) {System.out.println("its not hot anymore ");
		break; } 
		
		System.out.println("it is hot");
		temp--; }
		
		
		
		
		
		
		
		
	}

}
