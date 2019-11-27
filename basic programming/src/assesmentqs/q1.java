package assesmentqs;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			}
		int temp[]=new int[n];
		int small=0,large=n-1;
		boolean flag=true;
		for(int i=0;i<n;i++)
		{
			if(flag)
			{
				temp[i]=a[large--];
			}else
			{
				temp[i]=a[small++];
				flag=!flag;
				}
			}
		a=temp.clone();
		System.out.println(Arrays.toString(a));
	}

}
