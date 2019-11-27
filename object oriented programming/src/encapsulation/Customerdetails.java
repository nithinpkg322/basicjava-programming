package encapsulation;

import java.util.Scanner;

public class Customerdetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		customer sr=new customer();
		display r=new display();
		System.out.println("Registration");
		System.out.println("Enter the name");
		sr.setName(s.next());
		System.out.println("Enter the address");
		sr.setAddress(s.next());
		System.out.println("Enter the contact number");
		sr.setContactNumber(s.next());
		System.out.println("Enter the email id");
		sr.setEmail(s.next());
		System.out.println("Enter the proof type");
		sr.setProofType(s.next());
		System.out.println("Enter the proof id");
		sr.setProofID(s.next());
		System.out.println("*****REGISTRATION*****");
		r.show(sr.getName(),sr.getAddress(), sr.getContactNumber(), sr.getEmail(), sr.getProofType(), sr.getProofID());  
		
	}

}
