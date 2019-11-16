package palindrome;

import java.util.Scanner;

public class StringPali {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("check the given number is palindrome or not");
	String st=s.nextLine();
	String rev="";
	int j;
	int len=st.length();
	for(j=len-1;j>=0;j--);
	{
		rev=rev+st.charAt(j);
	}
	if(rev.equals(st))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}


	}

}
