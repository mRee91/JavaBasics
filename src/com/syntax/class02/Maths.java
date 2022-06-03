package com.syntax.class02;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	byte single=2;
	short triple=200;
	int saywoh=20002;
	long lots=252525252l;
	
	float decim=1.5f;
	double ddecim=5.789456;
	
	char chr='&';
	
	String love="hug";
	
	System.out.print(single+" + "+triple+" = ");
	System.out.println(single+triple);
	
	System.out.print(saywoh+" - "+triple+" = ");
	System.out.println(saywoh-triple);
	
	single=5;
	triple=150;
    saywoh=154789;
    lots=458844541;
    
    long samosa, chicken, fries, pepsi;
    samosa=single+triple;
    chicken=saywoh/triple;
    fries=saywoh*single;
    pepsi=lots-saywoh;
    
    System.out.println(samosa+chicken);
    System.out.println(fries*pepsi/lots);
    
 
	}

}
