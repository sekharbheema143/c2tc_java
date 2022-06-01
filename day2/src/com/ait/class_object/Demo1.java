//you can create multipe objects in one class
package com.ait.class_object;

public class Demo1 {
	int x;
	public static void main(String[] args) {
		Demo myobj1=new Demo();
		Demo myobj2=new Demo();
		myobj1.x=500;
		myobj2.x=5000;
		System.out.println(myobj1.x);
		System.out.println(myobj2.x);

	}

}
