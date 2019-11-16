package companyquestions;
import java.util.Scanner;

public class Secondlargestelement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n[]=new int[5];
		int i=0,j=0,max=0;int temp;
				for(i=0;i<5;i++)
				{
					n[i]=s.nextInt();
				}
		         for(i=0;i<5;i++)
		         {
		        	 for(j=i+1;j<5;j++)
		        	 {
		        		 if (n[i] > n[j])
		        		 {
		        			 temp =n[i];
		        			 n[i]=n[j];
		        			 n[j]=temp;
		        			 
		        		 }
		        	 }
		         }
                 System.out.println(n[5-2]);
	}

}
