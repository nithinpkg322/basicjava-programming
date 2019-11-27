package Strings;

import java.util.Scanner;

public class str2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String[] words=a.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(i%2!=0)
			{
				int l=words[i].length();
				for(int j=l-1;j>=0;j--)
				{
					System.out.print(words[i].charAt(j));
				}
				System.out.print(" ");
			}
			else
			{
		System.out.print(words[i]+" ");
		}
		
		}
	}
}


