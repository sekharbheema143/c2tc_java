package zoneddatetimeclass;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MyClass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println(currentTime);
        ZonedDateTime currentTimeinparis =        ZonedDateTime.now(ZoneId.of("Europe/Paris"));
System.out.println(currentTimeinparis);     

	}

}
