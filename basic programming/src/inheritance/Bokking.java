package inheritance;

import java.util.Scanner;

public class Bokking {
	
	public void book(int persons, int totaldays, int tariff)
	{
		double total=totaldays*tariff*persons;
		System.out.println("Total Tariff: "+total+"/-");

	}

}
