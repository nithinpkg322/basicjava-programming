package companyquestions;
import java.util.Scanner;

public class coversionbtod {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int decimal=n;
	String binary=Integer.toBinaryString( decimal);
	System.out.println(binary);
	}

}
