package Patterns;

import java.util.Scanner;

public class qs15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n*2;j++)
			{
				if((i+j)==5||(j-i)==5)
				{
			System.out.print("*");	
			}
				else
				{
					System.out.print("#");		
				}
		}
		
		System.out.println();	
	}

}
}
