package com.syntax.class11;

public class Car {
	
	String model;
	String make;
	String colour;
	String Engine;
	int year;
	int doors;
	int hp;
	
	void moveForward() { System.out.println("Car is moving forward");}

	void reverse() { System.out.println("Car is reversing");}

	
	
	public static void main(String[] args) {

    Car bmw=new Car();
    bmw.model="X6";
    bmw.make="BMW";
    bmw.colour="Black";
    bmw.year=2022;
    bmw.Engine="V8";
    bmw.hp=500;
    
    System.out.println(bmw.model);
		
	bmw.moveForward();
	bmw.reverse();
		
	}}
