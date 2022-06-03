package explore;

import java.util.Scanner;

public class Feminism {

	public static void main(String[] args) throws InterruptedException {


		Scanner inp= new Scanner(System.in);


System.out.println("You aprouch a woman who is crying in a dark alley");
Thread.sleep(2000);
System.out.print("She turns around and looks at you");
System.out.print(".");		Thread.sleep(700);
System.out.print(".");		Thread.sleep(700);
System.out.println(".");		Thread.sleep(700);

System.out.print(".");		Thread.sleep(700);
System.out.print(".");		Thread.sleep(700);
System.out.println("What will you do?"); Thread.sleep(2000);

System.out.println("A) Slap her across the face and say 'man up'"); Thread.sleep(2000);
System.out.println("B) Stroke her on the head and say dont worry girl, im here for you"); Thread.sleep(1000);
		String i1=inp.next();

		
		//split 1a
		if(i1.equalsIgnoreCase("A")) {System.out.println("she says your right, cut your cock off, give it to me, and ill be a man");Thread.sleep(2000);
		System.out.println("What do you do?");Thread.sleep(2000);
		System.out.println("A) Cut off your cock and pass it over"); Thread.sleep(2000);
		System.out.println("B) Slap her accross the face and say nothing"); Thread.sleep(1000);
		String i2=inp.next();
		    //split 2a
		     if (i2.equalsIgnoreCase("A")) {System.out.println("You bleed out and die! You dumb fuck, Why whould you do that?");Thread.sleep(1000);
				System.out.println("Game Over");}
		     else if (i2.equalsIgnoreCase("B")) {System.out.print("You slap her across the face, ");  Thread.sleep(1000); System.out.println("She Orgasms and falls in love with you"); Thread.sleep(1000);
		     System.out.println("You have passed the first level. Good Man!");
		     }    }

		
		
		
		
		
        //split 1b
		else if (i1.equalsIgnoreCase("B")) {System.out.println("You gay fuck MAN UP and learn to slap women");
		Thread.sleep(1000);System.out.println("Game Over");}
		
		
		
		
		
		
		

	}

}
