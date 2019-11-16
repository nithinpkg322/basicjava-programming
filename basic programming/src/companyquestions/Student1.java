package companyquestions;
import java.io.*;
import java.util.*;

	public class Student1
	{
		public static void main(String[] args) 
		{
			
		Scanner s=new Scanner(System.in);
		System.out.println("Name,Roll NO,Age");
		String a=s.nextLine();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("Enter Three marks");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		Student sr=new Student();
		System.out.println("Student Details");
		sr.details(a,b,c);
		sr.mark(x,y,z);
		sr.rank();
		}
}
	 class Student {
			String name;
			int age,rolno;
			int total;
			public void details(String name,int rn,int age)
			{
				this.name=name;
				rolno=rn;
				this.age=age;
				System.out.println("name:"+name);
				System.out.println("Roll No:"+rolno);
				System.out.println("Age:"+age);
		}
			public void mark(int a,int b,int c)
			{
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				total=a+b+c;
			}
			public void rank()
			{
				if(total>90&&total<100)
					System.out.println("1");
				else
					System.out.println("2");
				
			}
		}
