package arrays;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the year");
        int ly = s.nextInt();
        if((ly%4==0 && ly%100!=0)||(ly%400==0))
            System.out.println("leapyear");
            else {
            	System.out.println("not leapyear");	
            	s.close();
            }
	}

}
