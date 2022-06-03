package com.syntax.class06;

public class EnhacedCode2 {

	public static void main(String[] args) {
		
	int num1 = 1, num2 = 2, num3 = 2;
	int largest=0;
	
	if (num1>num2&&num1>num3) {largest=num1;}
	else if (num2>num1&&num2>num3) 	{largest=num2;}
	else if (num3>num1&&num3>num2) {largest=num3;}
	
	else if (num1==num2&&num1==num3)System.out.println("All number are equal");
	
	else if (num1==num2&&num1>num1) largest=num1;
	else if (num1==num3&&num3>num2) largest=num2;
	else if (num2==num3&&num2>num1) largest=num3;
	
	
	if (largest !=0) System.out.println(largest + " is the largest");  // important part
	
	
		
		
		

	}

}
