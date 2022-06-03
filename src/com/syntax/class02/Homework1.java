package com.syntax.class02;

import java.awt.Point;
import java.sql.Date;

public class Homework1 {

	public static void main(String[] args) {
		   float d=1.5f;
		   double d2, add, sub, mul, div;
		d2=5.789456;
		add=d+d2;
		sub=d2-d;
		mul=d*d2;
		div=d2/d;
		   int width, height, parameter, area;
		width=5;
		height=8;
		parameter=width*2+height*2;
		area=width*height;
		
		double rs=Math.pow(9,3);
		//Math.pow( , ) = The second number is the amount of times the 1st number is mulltiplied by itself. 
		
		double ds=Math.sqrt(100);
		//directly square rooting
		
		
		System.out.println(Math.sqrt(9));
		System.out.println(rs);
		System.out.println(ds);

		System.out.println("The sum of the 2 numbers "+d+" and "+d2+" is equal to "+add+".");
		System.out.println("The Multiplication of the 2 numbers "+d+" and "+d2+" is equal to "+mul+".");
		System.out.println(d2+" divided by "+d+" is equal to "+div+".");
		System.out.println(d2+" takeaway "+d+" is equal to "+sub+".");
		System.out.println("The square of 3.5 is equal to "+3.5*3.5+".");
		System.out.println("The paremeters of a rectangle with a width of "+width+" and a height of "+height+" is equal to "+parameter+" and the area is "+area+".");

		
		
	}

}
