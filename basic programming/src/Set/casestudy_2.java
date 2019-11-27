package Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class casestudy_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int flag=0;
		ArrayList list = new ArrayList();


		do {
		System.out.println("1.Display installed application\n2.Install an application\n3.Uninstall an application\n4.Quit");
		int n = s.nextInt();

		if(n==1) {


		if(list.isEmpty()) {
		  System.out.println("There is no application installed.");
		  }


		else {
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		}
		}


		if(n==2) {

		System.out.println("Enter Name");
		String name = s.next();
		Iterator itr1= list.iterator();
		while(itr1.hasNext()) {
		String np =(String) itr1.next();
		if(np.equals(name)) {
		flag=1;
		break;
		}

		}
		if(flag==1) {
		System.out.println("Already Installed");

		}
		else {
		list.add(name);
		System.out.println("Application Installed");
		}


		}
		              if(n==3) {
		            		if(list.isEmpty()) {
		            			  System.out.println("There is no application installed.");
		            			  }
		            		else {
		            			
		            		
		             Iterator itr2= list.iterator();
		             for(int i=0;i<list.size();i++) {
		             System.out.println(i+ " "+itr2.next());
		             
		             }
		             System.out.println("Enter the index to delete");
		             int index = s.nextInt();
		             list.remove(index);
		             System.out.println("Application Uninstalled");

		}}
		             if(n==4) {
		            System.out.println("Sucessfully Exit");
		            return;
		  }
		             else if(n<0 || n>4) {
		            System.out.println("Invaild output");
		            }
		             }
		while(true);

		}
	}
	
    	 
	     
	
