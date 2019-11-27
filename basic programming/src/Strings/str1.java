package Strings;

import java.util.Scanner;

public class str1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a="face";
		String b="academy";
		Boolean e=a.equals(b);
		System.out.println(e);
		System.out.println("length:"+a.length());
		System.out.println("char a:"+a.charAt(3));
		System.out.println("sub String:"+b.substring(2,5));
		System.out.println("index:"+a.indexOf("e"));
		System.out.println("concat:"+a.concat(b));
		System.out.println("replace:"+b.replace("a","A"));
		String[] w=a.split("c");
		for(int i=0;i<a.length();i++)
		{
		System.out.println(w[i]);
		}
		
	}

}
