package Strings;

import java.util.Scanner;

public class buffer3hh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("enter the name");
		s.append(sc.next());
		System.out.println("enter the father name");
		s.append(sc.next());
		System.out.println(s);
	}

}
