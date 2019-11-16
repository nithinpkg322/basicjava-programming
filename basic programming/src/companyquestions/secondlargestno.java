package companyquestions;
import java.util.Scanner;

public class secondlargestno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=5;

		int a[]=new int[size];
		int temp,i,j;
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[size-2]);
	}

}
