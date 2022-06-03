package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		num=num+100;
		
		System.out.println(num);
		
		num+=100; // shorthand operator. what comes after += is calculated firsr.
		
		System.out.println(num);
		
		//---------------------------------
		// task from powerpiont

		int number=10;
		number+=500+200;
		System.out.println(number);
		
		int number2=200;
		number2-=60;
		System.out.println(number2);
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		int cake=25;
		cake%=7;
		System.out.println(cake);
	}

}
