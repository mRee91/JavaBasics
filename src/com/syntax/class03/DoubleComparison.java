package com.syntax.class03;

public class DoubleComparison {

	public static void main(String[] args) {
		double one = 1, two = 2;

		if (one < two) {
			System.out.println(" Double value " + two + " larger than " + one);
		} else {
			System.out.println("Double value " + two + "is not larger than" + one);
		}

		double temp = 31.0;
		if (temp < 32) {
			System.out.println("Water will freeze with tempurature " + temp);
		} else {
			System.out.println("Water will NOT freeze with tempurature " + temp);
		}
	}
}

//taking away the curly brackets it will only read one line each per block..
//after if and else