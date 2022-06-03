package explore;

public class loopsWhileAndNonwhile {

	public static void main(String[] args) {
		
		
	     int num = 1;
	     boolean boo = num<5;
	     
	     while (num<6) { System.out.println("Okay the num +1 is now = "+num); num=num+1;}
		//___________________________________________________________________________
	
		// I first copy tryingIfStatemtns code her and add while to it.. Lets TRRY
		
		float money=5.35f;
		long moodLevel=6;
		boolean available=true;
		
		while(money>=1) { //here and..
			
		
	if(money>=1 && moodLevel>5) {
		if(available) {
			System.out.println("Buy it quckly!");
			money=money-1;} //here are the while statements
			else {System.out.println("Try and buy but oh my oh my!");}
		
	}
	
	else {System.out.println("Dont even try");}	
		
	}

}

		
	}

/*
 * there are -do- while statement. 
 * puting the -do- INFRONT not within enables it 
 * to run the code once before carrying on the while loops
*/