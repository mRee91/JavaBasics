package explore;

public class tryingIfStatements {

	public static void main(String[] args) {

		
		//buying something for 4£ if your in the mood and if its available
		float money=5.35f;
		int moodLevel=6;
		boolean available=false;
		
				
				/*
				 * Trying if statement within if statement
				 * try changing values to see different results
				 */
		
	if(money>=4 && moodLevel>5) {
		if(available) {
			System.out.println("Buy it quckly!");}
			else {System.out.println("Try and buy but oh my oh my!");
		}
		
	}
	else {System.out.println("Dont even try");}	
		
	}

}
