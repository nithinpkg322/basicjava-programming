package controlstructure;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		for(i=0;i<4;i++)
		{
			for(j=0;j<=1;j++)
			{
				System.out.println("*");
			}
			{
				System.out.println("\n");
			}
		}
