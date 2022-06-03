package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		// buying something for 4£ if your in the mood and if its available
		float money = 5.35f;
		int moodLevel = 6;
		boolean available = false;

		/*
		 * Trying if statement within if statement try changing values to see different
		 * results
		 */

		if (money >= 4 && moodLevel > 5) {
			if (available) {
				System.out.println("Buy it quckly!");
			} else {
				System.out.println("Try and buy but oh my oh my!");
			}

		} else {
			System.out.println("Dont even try");
		}

		// ______________________________________

		boolean vaccine = true;
		int dose = 1;
		if (vaccine) {
			System.out.println("Let me check if you got a second dose");
			if (dose == 1) {
				System.out.println("You need another shot");
			}else
					System.out.println("You are fully vaccinated");

			}
		}
	}


