package companyquestions;

import java.util.Scanner;

public class maximumelement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int arr[][]=new int[row][col];
		int i,j,largest=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
				}}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if (arr[i][j]>largest)
				{
					largest=arr[i][j];
				}
				}}
		System.out.printf("maximum element is %d",largest);
		
	}

}
