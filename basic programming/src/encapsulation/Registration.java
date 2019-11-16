package encapsulation;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		details n=new details();
		do {
		System.out.println("Registration");
		System.out.println("Enter the name");
		n.setName(s.next());
		System.out.println("Enter the address");
		n.setaddress(s.next());
		System.out.println("Enter the contact number");
		n.setcontactNumber(s.next());
		System.out.println("Enter the email id");
		n.setEmail(s.next());
		System.out.println("Enter the proof type");
		n.setproofid(s.next());
		System.out.println("Enter the proof id");
		n.setproofid(s.next());
		n.show();
		}
		while(n.getName()==null||n.getAddress()==null||n.getEmail()==null||n.getContactNumber()==null||n.getProofType()==null||n.getProofID()==null);
	}
}

