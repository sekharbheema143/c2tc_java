package staticKeyword;

public class Student11 {
	int rollno;
	String name;
	static String college;
	static {
		college ="ITIS";
	}
	Student11(int r,String n){
		rollno = r;
		name = n;
	}
	static void change() {
		college = "Ait";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Student11 s1 = new Student11(118,"amma");
		Student11 s2 = new Student11(119,"nanna");
		change();
		s1.display();
		s2.display();
		

	}

}
