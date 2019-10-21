package decisionmaking;

import java.util.Scanner;

public class Ifelsestat1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char Name = s.next().charAt(0);
		int Pass = s.nextInt();
		if(Name=='A' && Pass==1)
		{
			System.out.println("sucessful");
		}
		else {
			System.out.println("not sucessful");
		}
			
	}

}
