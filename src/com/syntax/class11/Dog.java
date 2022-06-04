package com.syntax.class11;

import java.util.Scanner;

public class Dog {



		String name;
		int age;
		double weight;
		String colour;    // properties, attributes. fields
		double height;    // of a class
		String breed;
		
		void bark() {
			System.out.println("Dog barks");
		}
		void walks() {
			System.out.println("Dog walks");
		}
		void eat() {
			System.out.println("Dogs eat bones");
		}
		
		
		
		public static void main(String[] args) {
		
			Scanner inp=new Scanner(System.in);
			
		Dog scooby= new Dog();  //new Dog() how we create an object
		scooby.name="Scooby";
		scooby.age=6;
		scooby.weight=16;
		scooby.colour="Pink";	
		scooby.height=2.6;	
		scooby.breed="Germain";	
			
		scooby.bark();	
			
			
			
		} }
