package com.syntax.class03;

public class PrimitaveCasting {

	public static void main(String[] args) {
		
		int i=100;
		double d=100;
		
		//widening - implicit casting - Automatic
		//narrowing - explicit casting - Manual
		int x=100.99; //error
		int y=(int)100.99; // no error
		System.out.println(y);
		
		byte b=(byte)130;
		System.out.println(b);
		
		
		
		
	}

}
