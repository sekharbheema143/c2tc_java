package day11_practise;

public class D1 {

	public static void main(String[] args) {
		String s="Great",t = "H";
		String u = s.concat(t);
		if(u == s) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		String e= s + t;
		if(e == s) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}

	}

}
