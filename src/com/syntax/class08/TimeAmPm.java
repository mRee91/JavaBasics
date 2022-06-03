package com.syntax.class08;

public class TimeAmPm {

	public static void main(String[] args) {
		String ampm="null";
		
for(int q=1; q<=2; q++) {if (q==1) {ampm="am";}else {ampm="pm";} 
    for(int h=1; h<=12; h++) {
    	for(int m=0; m<=5; m++) {
    		for(int m2=0; m2<=9; m2++) {System.out.println(h+":"+m+m2+" "+ampm);}}}}


	}

}
