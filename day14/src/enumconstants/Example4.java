package enumconstants;
//Specifying initial value to the enum constants
public class Example4 {
	public enum Season{
		SUMMER(10),WINTER(5),SPRING(15),AUTUMN(20);
		int value;
		Season(int value)
		{
			this.value=value;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Season s : Season.values()) {
			System.out.println(s + " " + s.value);
		}

	}

}
