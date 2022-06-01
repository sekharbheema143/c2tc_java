package com.ait.practise;

public class Apple {
		int weight;
}
class Main{
	
	public static void main(String[] args) {
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		a1.weight = 100;
		a2.weight = 50;
		a2 = a1;
		System.out.println(a2.weight);
		
		

	}

}
