package com.ait.foreachloop;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term = 6;
		for(int i = 1;i <=term;i++) {
			for(int j = term;j >= i;j--) {
				System.out.println("* ");
			}
			System.out.println();
		}

	}

}
