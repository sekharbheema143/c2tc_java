package staticKeyword;

public class Student9 {
	int rollno;
	String name;
	static String college = "TTS";
	Student9(int r,String n)
	{
		rollno = r;
		name = n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
	
		Student9 s1 = new Student9(111,"reddy");
		Student9 s2 = new Student9(112,"Aryan");
		s1.display();
		s2.display();
	}

}
