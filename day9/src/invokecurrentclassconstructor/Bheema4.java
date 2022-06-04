package invokecurrentclassconstructor;

public class Bheema4 
{
	Bheema4()
	{
		System.out.println("hello a");
	}
	Bheema4(int x)
	{
		this();
		System.out.println(x);
	}
}
class TestThis5
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bheema4  a = new Bheema4();

	}

}
class hello
{
	hello()
	{
		this(5);
		System.out.println("hello a");
	}
	hello(int x)
	{
		System.out.println(x);
	}
}
class Main
{
	public static void main(String args[])
	{
		hello a = new hello();
	}
}