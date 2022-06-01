package com.ait.practise2;

public class Company3 {
	String name;
		public static void main(String args[]) {
			Company3 c3 = new Company3();
			c3.name = "C2TC";
			Company3 c4 = c3;
			c3 = null;
			System.out.println(c4.name);
		
		}
}
