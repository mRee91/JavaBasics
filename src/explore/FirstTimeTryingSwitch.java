package explore;

public class FirstTimeTryingSwitch {


	public static void main(String[] args) {

		char Letter= 'B';   // we use SWITCH to replace ELSE IF ELSE IF ELSE IF because else if takes longer to run.
		                  
		switch(Letter) {
		case 'A': System.out.println("This is case A"); break;
		case 'B': System.out.println("This is case B"); break;
		case 'C': System.out.println("This is case C"); break;
		case 'D': System.out.println("This is case D"); break;      
		default:System.out.println("Invalid");}

		int num= 45;
		switch(num) {
		case 44: System.out.println("case 44"); break;
		case 45: System.out.println("case 45");break;     }
		
		String name="Rami";
		switch(name) {
		case "Rami": System.out.println("thats my name, dont wear it out"); break;
		case "WiniThePoo": System.out.println("Yellow Bear"); break;
		case "Ginger": System.out.println("Ginger is really good for you. My beard is ginger"); break;
		}
		
		
    
}}
