package regex;
import java.util.regex.*;
public class RegexExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("metacharacters d....");
        System.out.println(Pattern.matches("\\d","abc"));
        System.out.println(Pattern.matches("\\d","1"));
        System.out.println(Pattern.matches("\\d","4443"));
        System.out.println(Pattern.matches("\\d","323abc"));


		

	}

}
