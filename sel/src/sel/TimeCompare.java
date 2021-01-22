package sel;

import java.time.LocalTime;

public class TimeCompare {

	public static void main(String[] args) {

		
		LocalTime t1 = LocalTime.parse("00:00");
		LocalTime t2 = LocalTime.parse("01:00");
		System.out.println(t1);
		
		if(t1.isAfter(t2)) {
			System.out.println("wrong");
		}else {
			System.out.println("right");
		}
	}

}
