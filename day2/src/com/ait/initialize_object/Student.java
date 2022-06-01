// By reference variable
package com.ait.initialize_object;

public class Student {
	int id;
	String name;
}
class Main{	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 105;
		s1.name = "sekhar";
		System.out.println(s1.id + " " + s1.name);
}}