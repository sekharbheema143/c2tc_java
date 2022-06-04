package wrappertoprimitive;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = new Integer(3);
		int i=a.intValue();//converting Integer to int explicitly
		int j=a;//unboxing
		System.out.println(a+" "+i+" "+j);
		

	}

}
