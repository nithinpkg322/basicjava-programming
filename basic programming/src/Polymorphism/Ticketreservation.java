package Polymorphism;

import java.util.Scanner;

public class Ticketreservation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Ticket a=new Ticket();
		System.out.println("Enter the movie");
		String x=s.nextLine();
		System.out.println("Enter the date");
		String y=s.nextLine();
		s.nextLine();
		System.out.println("Enter no of persons");
		String z=s.nextLine();
		
		a.display(x, y, z);

	}

}