package inheritance;

import java.util.Scanner;

public class peakseason {

	public static void main(String[] args) {
		int month;
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
		System.out.println("Enter the month");
			int f=s.nextInt();
		//if(month==4 || month==5 || month==6 || month==9 || month==11 || month||==12)
		{
			System.out.println("Enter the peak charges");
			int g=s.nextInt();
		}
		if(month==1 || month==2 || month==3 || month==7 || month==8 || month||==10)
		System.out.println("Enter the Discount");
		int e=s.nextInt();
		
		
		
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

}
