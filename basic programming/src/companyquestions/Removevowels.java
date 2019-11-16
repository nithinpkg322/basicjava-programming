package companyquestions;
import java.util.Scanner;

public class Removevowels {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	      String a=s.next();
	      int b=a.length();
	      for(int i=0;i<b;i++)
	      {
	        char c=a.charAt(i);
	        if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
	        {
	          continue;
	        }
	        {
	      System.out.print(c);
	      }
	}

}
}
