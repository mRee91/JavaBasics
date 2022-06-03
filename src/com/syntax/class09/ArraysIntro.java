package com.syntax.class09;

import java.util.Scanner;

public class ArraysIntro {

	public static void main(String[] args) {

Scanner inp = new Scanner(System.in);
		
		int[] b=new int[4];
		b[0]=90;
		b[1]=-85;
		b[2]=70;
		b[3]=100;
		//b[4]=110; <-- doesnt work
		System.out.println(b[1]);
		
		String[] classMates=new String[5];
		classMates[0]="Khrystyna";
		classMates[1]="Zameer";
		classMates[2]="Elexia";
		classMates[3]="Oleg";
		//classMates[4]="Adem";
		classMates[4]=inp.next();
		
		System.out.println(classMates[4]);
		
		
		String[] fruits= {"mango","apple","kiwi","pear"};
		
		int size=fruits.length;
		System.out.println(size);
		
		
		String[] words= {"Saturday", "is", "Java", "coding", "Day"};
		System.out.println(words[0]+" "+words[1]+" "+words[2]+" "+words[3]+" "+words[4]);
		
		String[] grade=new String[5];
		grade[0]="A";
		grade[1]="B";
		grade[2]="C";
		grade[3]="D";
		grade[4]="E";
		grade[4]=inp.next();
		
		String[] grAde= {"A","B","C","D","E","F"};
		System.out.println(grade[1]+grAde[1]);
	}

}
