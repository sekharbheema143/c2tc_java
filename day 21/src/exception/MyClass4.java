package exception;

public class MyClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data = 30/3;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
	}

}
