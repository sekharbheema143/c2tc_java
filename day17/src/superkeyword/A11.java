//super can be used to refer immediate parent class instance variable
package superkeyword;

class Animal
{
	String color="white";
	
}
class Dog extends Animal
{
	String color="black";
	void printcolor() {
		System.out.println(color);// prints color of dog class
		System.out.println(super.color);// prints color of Animal class
	}
}


public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.printcolor();
		

	}

}
