package companyquestions;

import java.util.Scanner;

public class add2matrix {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	int c=s.nextInt();
	int a[][]=new int[r][c];
	int b[][]=new int[r][c];
	int c1[][]=new int[r][c];
	int i;
	int j = 0;
	for( i=0;i<r;i++)
	{
		for( j=0;j<c;j++)
		{
			a[i][j]=s.nextInt();
			}
	}
		for( i=0;i<r;i++)
		{
			for( j=0;j<c;j++)
			{
				b[i][j]=s.nextInt();
				}
		}
		c1[i][j]=a[i][j]+b[i][j];
		System.out.println(c1[i][j]);
	}

	}


