package interface1;

interface Scooty
{
	void getMileage();
}
class R16 implements Scooty
{
	public void getMileage()
	{
		System.out.println("Mileage is 40 km/L");
	}
	
}
public class InterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R16 Scooty = new R16();
		Scooty.getMileage();

	}

}
