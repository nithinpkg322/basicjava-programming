package Dateandtime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class caseqs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String a=s.next();
		System.out.println("enter the address");
		String b=s.next();
		System.out.println("enter no of rooms");
		int r=s.nextInt();
		System.out.println("enter no of persons");
		int p=s.nextInt();
		System.out.println("enter the Ac/nonAc");
		String ac=s.next();
		System.out.println("Booking date");
		String start=s.next();
		System.out.println("check date");
		String end=s.next();
		LocalDate ds = LocalDate.parse(start);
		LocalDate de = LocalDate.parse(end);
	    long total = ChronoUnit.DAYS.between(ds,de);
        int price=s.nextInt();
        int tot=0;
        int e=0;
        if( p!=(2*r))
        {
        	tot=(price*p-1)+250;
	}
        else
        {
        	total=(price*p);
        }
        if(ac.equals("yes==true"))
        {
        	e=(int)(600*total);
        	}
        long amt=(tot*total)+e;
		System.out.println(a);
		System.out.println(b);
		System.out.println(r);
		System.out.println(p);
		System.out.println(ac);
		System.out.println(total);
		System.out.println(amt);
        


	}
}
