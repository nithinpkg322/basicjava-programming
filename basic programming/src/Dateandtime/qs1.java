package Dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class qs1 {

	public static void main(String[] args) {
		System.out.println("current date");
		LocalDate date=LocalDate.now();//create a date object
		System.out.println(date);//Display the current date
		System.out.println("current time");
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println("current Date and Time");
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		

	}

}
