package Strings;

import java.util.Scanner;

public class qs5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        String c=s.next();
        char [] d=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
        if(d[i]=='a'||d[i]=='e'||d[i]=='i'||d[i]=='o'||d[i]=='u'||d[i]=='A'||d[i]=='E'||d[i]=='I'||d[i]=='O'||d[i]=='U')
        {
        	d[i]='$';
        	 }
        else
        {
        	d[i]=d[i];
        	
        }
        }
        char [] d1=a.toCharArray();
        for(int i=0;i<b.length();i++)
        {
        if(d1[i]=='a'||d1[i]=='e'||d1[i]=='i'||d1[i]=='o'||d1[i]=='u'||d1[i]=='A'||d1[i]=='E'||d1[i]=='I'||d1[i]=='O'||d1[i]=='U')
        {
        	d1[i]=d1[i];
        	
        	 }
        else
        {
        	d1[i]='#';
        	
        }
        }
        String x=new String(d);
        String y=new String(d1);
        String z=c.toUpperCase();
        String w=x.concat(y);
        String string=x.concat(z);
        System.out.println(string);
        
       
        	
      
        }
	}


