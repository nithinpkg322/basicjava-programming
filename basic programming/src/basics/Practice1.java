package basics;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float a = s.nextFloat();
		s.nextLine();
		System.out.printf("%.3f",a);
		int b = s.nextInt();
		System.out.printf("%03f",b);
		
	}

}
