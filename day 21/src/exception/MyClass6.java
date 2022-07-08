package exception;

public class MyClass6 {
	public static void validate(int age) {
		if(age<21 || age>27)
			throw new ArithmeticException("not eligible");
		else 
			System.out.println("Eligible to attend Military selection");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(30);
		System.out.println("rest of the code....");
		
			

	}

}
