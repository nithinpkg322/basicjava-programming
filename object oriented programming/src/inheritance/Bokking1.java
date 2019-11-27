package inheritance;

public class Bokking1 {
	public void book(int persons, int totaldays, int tariff)
	{
		double total=totaldays*tariff*persons;
		System.out.println("Total Tariff: "+total+"/-");

	}

}
