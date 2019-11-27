package Dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class qs2 {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("before formatting:"+dt);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("E ,dd ,MMM ,YYYY ,HH :MM : SS");
		String formatDate=dt.format( format);
		System.out.println("After formatting:"+formatDate);
	}

}
