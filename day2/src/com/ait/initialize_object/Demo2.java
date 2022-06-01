package com.ait.initialize_object;

public class Demo2 {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
		void displayInformation() {
			System.out.println(rollno + " " + name);
		}
}
class Test{
	public static void main(String args[])
	{
		Demo2 s1 = new Demo2();
		Demo2 s2 = new Demo2();
		s1.insertRecord(105,"prabhas");
		s2.insertRecord(106,"bheema");
		s1.displayInformation();
		s2.displayInformation();
	}
}
