package day15_practise;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date mydate = new Date();
		System.out.println("System date:"+ mydate.toString());
		mydate.setTime(15680);
		System.out.println("Time after setting:"+ mydate.toString());
		int d = mydate.hashCode();
		System.out.println("Amount (in ms) by which time"+"is shifted:"+d);
	}

}
