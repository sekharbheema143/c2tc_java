package enummethods;

public class Example3 {
	public enum Season {
		SUMMER,WINTER,SPRING,AUTUMN
	}

	public static void main(String[] args) {
		for (Season s : Season.values()) {
			System.out.println(s);
		}
		System.out.println("value of WINTER is:"+Season.valueOf("WINTER"));
		System.out.println("Index of WINTER is:"+Season.valueOf("WINTER").ordinal());
		System.out.println("Index of SUMMER is:"+Season.valueOf("SUMMER").ordinal());
		

	}

}
