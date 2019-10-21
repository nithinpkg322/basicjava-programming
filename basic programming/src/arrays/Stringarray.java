package arrays;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size: ");
		int size=s.nextInt();
		String array[]=new String[size];
		int i;
		for(i=0;i<size;i++)
		{
			array[i]=s.next();	
		}
		char c;
		for(i=0;i<size;i++)
		{
			c=array[i].charAt(0);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')

			System.out.println(array[i]);
	}
	
}
}