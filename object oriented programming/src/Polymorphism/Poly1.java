package Polymorphism;

import java.util.Scanner;

public class Poly1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Add n=new Add();
		System.out.println("Enter the number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		n.add(a);
		n.add(a,b);
		n.add(a,b,c);
		
		

	}

}
