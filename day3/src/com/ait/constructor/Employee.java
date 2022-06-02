package com.ait.constructor;

 class Employee {
	int id;
	String name;
	float salary;
	Employee(){
		System.out.println("user defined no-argument" + "constructor executed");
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}
  class get{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.display();
		e2.display();
	}

}
