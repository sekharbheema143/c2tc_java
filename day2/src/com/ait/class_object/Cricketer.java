package com.ait.class_object;

public class Cricketer {
	String name = "bheema";
	int age = 22;
	String color = "red";
	String role = "all rounder";
	
	void display() {
		System.out.println("I LOVE CRICKET");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Cricketer c = new Cricketer();
		c.display();
		System.out.println("main method ended");
	}

}
