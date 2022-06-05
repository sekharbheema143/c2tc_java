package regex;
import java.util.regex.*;
public class RegexExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+","a"));
        System.out.println(Pattern.matches("[amn]+","aaa"));
        System.out.println(Pattern.matches("[amn]+","aazzta"));
        
        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*","ammmna"));
		

	}

}
