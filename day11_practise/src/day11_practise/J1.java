package day11_practise;

public class J1 {

	public static void main(String[] args) {
		String str = "This is last index of example";
		int index = str.lastIndexOf("last");
		System.out.println(index);
		index = str.lastIndexOf("of",25);
		System.out.println(index);
		index = str.lastIndexOf("of",10);
		System.out.println(index);

	}

}
