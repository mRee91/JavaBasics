package com.syntax.class09;

import java.util.Scanner;  //if contidds whatever its called, when i searched google is 3 or more numbers that can divide  number

public class PrimeNumbers { public static void main(String[] args) {

	Scanner inp = new Scanner (System.in);
	
		int a= inp.nextInt(), q=0; String prime="null", con="null";
		
		for (int b=2; b<a; b++) {
			
			if(a%b==0) q+=1;
			if(a%b==0) {prime="not a prime";  break;}
			else {prime="a prime";}        }
		

			if (q>2) con="confedfs"; else con="not condd";
			
			System.out.println("the number entered is "+ prime+" and is.. "+con);
		
		
		
		
		
		
	}

}
