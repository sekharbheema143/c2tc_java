package staticKeyword;

public class Student10 {
	int rollno;
	String name;
	static String college = "TTS";
	Student10 (int r, String n){
		rollno = r;
		name = n;
	}
	static void change() {
		college = "BBDIT";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Student10 s1 = new Student10(113,"anjali");
		Student10 s2 = new Student10(114,"bheema");
		change();
		s1.display();
		s2.display();
		

	}

}
