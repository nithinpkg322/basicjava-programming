package Abstract;

import java.util.Scanner;

public class Abstraction {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	String n=s.nextLine();
	System.out.println("Enter the student id");
	int st=s.nextInt();
	System.out.println("Enter the student marks");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	int e=s.nextInt();
	student st1=new student();
	st1.details(n,st);
	System.out.println("Total mark is "+st1.total(a, b, c, d, e));
	st1.rank();
		}

}
abstract class Student1
{
	abstract void details(String a,int b);
	public void rank()
	{
		System.out.println("Rank 1");
		}
	abstract int total(int a,int b,int c,int d,int e);
}
class student extends Student1
{
	void details(String a,int b) {
		System.out.println("Name :"+a);
		System.out.println("studentid :"+b);
	}
	 int total(int a,int b,int c,int d,int e)
	{
		return a+b+c+d+e;
		
	}
	public void rank()
	{
		super.rank();
	}
	}

