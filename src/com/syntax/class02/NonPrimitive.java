package com.syntax.class02;

public class NonPrimitive {

	public static void main(String[] args) {
		
		String Teacher="Asel";
		String TeacherSurname="Umurzakova";
		String Address="Miami";
		int age=30;
		
		System.out.print("Super Teacher -> ");
		System.out.print(Teacher);
		System.out.print(" ");
		System.out.println(TeacherSurname);
		
		System.out.println("Name: "+Teacher+" "+TeacherSurname);
		System.out.println(Teacher+" "+TeacherSurname+" lives in " + Address+".");
        System.out.println("She is "+age+" years old.");
		
        Teacher="Goku";
        age=999999;
        Address="the other universe";
        
        System.out.println(Teacher+" has a power of "+age+" in "+Address+".");
       
	}

}
