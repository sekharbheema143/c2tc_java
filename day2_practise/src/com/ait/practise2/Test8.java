package com.ait.practise2;

public class Test8 {
		public static void main(String args[]) {
			Test8 obj = new Test8();
			obj.start();
		}
		void start() {
			String stra = "do";
			String strb = method(stra);
			System.out.println(": " + stra + strb);
		}
		String method(String stra) {
			stra = stra + "good";
			System.out.println(stra);
			return " good";
		}
}
