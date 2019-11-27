package loginpage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class qs1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		 Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		 Pattern pattern = Pattern.compile(regex);
		 System.out.println("enter the email id");
		 String email=s.next();
		 Matcher m=pattern.matcher(email);
	     System.out.println("enter the Password");
	     String password=s.next();
	     Matcher m1=pswNamePtrn.matcher(password);
	     if(m.matches())
	     {
	    	 System.out.println("valid email id"); 
	     }
	     else
	     {
	    	 System.out.println("invalid email id");
	     }
	     if(m1.matches())
	     {
	    	 System.out.println("correct password"); 
	     }
	     else
	     {
	    	 System.out.println("invalid password");
	     }	 
	    	 
	     }
}
