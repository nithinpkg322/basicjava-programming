package controlstructure;

import java.util.Scanner;

public class Fibano {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0, b = 1;
		System.out.printf("%d %d", a,b);
		for(int i=0;i<6;i++)
		{
			int c = a+b;
			System.out.printf("%d ", c);
			a = b;
			b = c;
			
		}
	}

}
