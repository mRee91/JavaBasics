package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class task1 { public static void main(String[] args) {


		
		Scanner inp = new Scanner(System.in);

System.out.println("Please enter the size of the array that you want to create");
	
	int arraySize=inp.nextInt();
	
	System.out.println("The size of the arrays is "+ arraySize);
	int [] integerArray=new int[arraySize];
	
	//we cant use enhanced for loop for inserting or updating the values of an array
	System.out.println("Please enter "+arraySize+" elements");
	for(int i=0; i<integerArray.length; i++) {
		integerArray[i]=inp.nextInt();
	}
	
	System.out.println(Arrays.toString(integerArray));
	
	int sum=0;
	for(int element:integerArray) {
		sum=sum+element;
	}
	
	System.out.println("The sum of all the elements is "+sum);
	
	inp.close();
	
	} }
