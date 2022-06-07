//changing number of arugments
package methodoverloading;

 class Add 
	{
		static int add(int a,int b)
		{
			return a+b;
		}
		static int add(int a,int b,int c)
		{
			return a+b+c;
		}
	
}
	
	class TestOverloading1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add.add(11,11));
		System.out.println(Add.add(11,11,11));

	}
	}

