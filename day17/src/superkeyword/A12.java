//super can be used to refer immediate parent class method
package superkeyword;

class Bheema
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class human extends Bheema
{
	void eat() {
		System.out.println("eating bread....");
	}
	void bark() {
		System.out.println("barking...");
	}
	void work(){
		super.eat();
		bark();
	}
}


public class A12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human d = new human();
		d.work();

	}

}
