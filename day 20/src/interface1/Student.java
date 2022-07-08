package interface1;

interface Writable{
	void writes();
}
interface Readable {
	void reads();
}
public class Student implements Readable,Writable
{
	public void reads() {
		System.out.println("Student reads...");
	}
	public void writes() {
		System.out.println("Student writes...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.reads();
		s.writes();

	}
}
