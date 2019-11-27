package Patterns;

import java.util.Scanner;

public class qs11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
      	  for(int j=0;j<(2*i+1)+2;j++) 
      	  {
      		  if(j==i+1)
      		  {
      			  System.out.print(" ");
      		  }
      		  else
      		  {
      			  System.out.print("*");  
      			 }
      		  }
      	  System.out.println();
        }
	}

}
