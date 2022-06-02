package com.ait.constructor;

 public class Bheema {
	int id;
	String name;
	float salary;
	
	Bheema (int id, String name, float salary){
		System.out.println("user defined no-argument" + "constructor executed");
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
} 
 class Got{
	public static void main(String[] args) {
		Bheema e1 = new Bheema(101,"srinath",70000);
		Bheema e2 = new Bheema(102,"bheema",75000);
		Bheema e3 = new Bheema(103,"prabhas",155000);

			e1.display();
			e2.display();
			e3.display();
	}

}
