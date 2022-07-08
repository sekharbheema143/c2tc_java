package exception;
import java.util.*;

public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;
		try
		{
			int z = x/y;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
