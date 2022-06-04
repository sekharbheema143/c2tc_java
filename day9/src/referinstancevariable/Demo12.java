package referinstancevariable;

public class Demo12 {
	int rollno;
	String name;
	float fee;
	Demo12(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
void display()
{
	System.out.println(rollno+" "+name+" "+fee);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo12 s1= new Demo12(121,"niranjan",55000f);
		Demo12 s2= new Demo12(122,"sai",65000f);
		s1.display();
		s2.display();
	}

}
