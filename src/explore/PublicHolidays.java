package explore;

import java.util.Scanner;

public class PublicHolidays {

	public static void main(String[] args) {
	String month= "Dec";
	int date= 20;
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a Month. e.g - Jan, Feb, Mar, Apr, May, Jun, ");
	System.out.println("                     Jul, Aug, Sep, Oct, Nov, Dec");
	month=input.next();
	System.out.println("");
	System.out.println("The month of "+month+" has been inputed.");
	System.out.println("");
	System.out.println(" Enter date(no 0's). e.g 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15");
	System.out.println("                     16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31");
	date=input.nextInt();
	

	if (month.equals("Jan")) {
		if(date==1) {System.out.println("It is 'New Years Day'");}
		else if (date==3) { System.out.println("It is 'New Years Day observed'");  }
		else System.out.println("not official holiday");}
			
	else if (month.equals("Apr")) {
		if(date==15) { System.out.println("It is 'Good Friday'"); }
		else System.out.println("not official holiday");}
	
	else if (month.equals("May")) {
		if(date==2) System.out.println("It is 'Early May Bank Holiday'"); 
		else System.out.println("not official holiday");}
		
	else if (month.equals("Jun")) {
		if(date==2)  System.out.println("It is 'Spring Bank Holiday'"); 
		else if(date==3) System.out.println("It is 'Queens Platinum Jubilee'");  
		else System.out.println("not official holiday");}	
		
	else if (month.equals("Dec")) {
		if(date==25)  System.out.println("It is 'Christmas Day'"); 
		else if(date==26) System.out.println("It is 'Boxing Day'");
		else if(date==27) System.out.println("It is 'Substitute Bank Holiday for Christmas Day'");
		else System.out.println("not official holiday");}	
	else {System.out.println("not official holiday");}
		
}}
