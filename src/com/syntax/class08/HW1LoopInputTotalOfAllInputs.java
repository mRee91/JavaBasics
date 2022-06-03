package com.syntax.class08;

import java.util.Scanner;

public class HW1LoopInputTotalOfAllInputs {

	public static void main(String[] args) {


		Scanner inp=new Scanner (System.in);
		
int odd=0, even=0; System.out.println("Enter 10 sets of values each followed by the enter key.");	

for   (int x=0; x<10; x++)    { int i1=inp.nextInt();      if(i1%2==0){even+=i1;}      else{odd+=i1;} }

System.out.println("The total of the odd numbers is "+odd+". The total of the even numbers is "+even+".");

	}

}
