package interface1;

interface Interface1
{
	public void myMethod();
}
interface Interface2
{
	public void myMethod();
}

public class Main implements Interface1, Interface2
{
	public void myMethod()
	{
		System.out.println("Implementing more than one interfaces");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
		obj.myMethod();

	}

}
