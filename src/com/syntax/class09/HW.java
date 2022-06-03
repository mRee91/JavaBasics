package com.syntax.class09;

public class HW {

	public static void main(String[] args) {

    int[] q= {10,15,20,25,30};
    int sum =0;
    int sumE=0;
    
    for(int i=0; i<q.length; i++) {sum+=q[i];}
    
    System.out.println("------------");
    
    
   for(int a:q) {sumE+=a;}
   
		
		System.out.println("for loop "+sum);
		System.out.println("for Enhanced loop "+sumE);
		
		
		
	}

}
