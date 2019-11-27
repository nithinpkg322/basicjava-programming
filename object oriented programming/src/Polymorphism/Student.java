package Polymorphism;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
		System.out.println("Enter the roll number");
		int rollno=s.nextInt();
		s.nextLine();
		System.out.println("Enter the department");
		String dpt=s.nextLine();
		System.out.println("Enter the five marks");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int m4=s.nextInt();
		int m5=s.nextInt();
		Student1 st=new Student1();
		st.display(name, rollno, dpt);
		st.display(m1, m2, m3, m4, m5);
		st.display();


		}

		}
		class Student1
		{
		int total;
		public void display(String name,int r,String dpt)
		{
		System.out.println("NAME OF STUDENT: "+name);
		System.out.println("ROLL NUMBER OF STUDENT: "+r);
		System.out.println("DEPARTMENT OF STUDENT: "+dpt);

		}
		public void display(int a,int b,int c,int d,int e)
		{
		total =a+b+c+d+e;
		if(total>450&&total<=500)
		System.out.println("Rank :"+1);
		if(total>400&&total<=449)
		System.out.println("Rank :"+2);
		if(total>350&&total<=399)
		System.out.println("Rank :"+3);
		if(total>300&&total<=349)
		System.out.println("Rank :"+4);

		}
		public void display()
		{
		float avg=(float)total/5;
		System.out.println("Average mark of the student is"+avg);
		}

		}