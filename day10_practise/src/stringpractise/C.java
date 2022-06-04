package stringpractise;

public class C {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 ="hello";
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str2 == s1);
		System.out.println(s1 == s2);

	}

}
