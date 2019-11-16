package inheritance;

import java.util.Scanner;

public class Seasonbooking {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of persons");
		int a=s.nextInt();
		System.out.println("Enter the number of days");
		int b=s.nextInt();
		System.out.println("Enter the room type");
		 String d=s.nextLine();
		 s.nextLine();
		System.out.println("Enter the tariff for a single person");
		int c=s.nextInt();
		
		Season_tick st=new Season_tick();
		st.person(a);
		st.Days(b);
		st.gettariff(c);
		a=st.setperson();
		b=st.setdays();
		c=st.settariff();
		Bokking bk=new Bokking();
		st.book(a,b,c);
	

	}

}
