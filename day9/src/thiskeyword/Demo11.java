package thiskeyword;

public class Demo11 
{
	void m()
	{
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo11 obj = new Demo11();
		System.out.println(obj);
		obj.m();
	}

}
