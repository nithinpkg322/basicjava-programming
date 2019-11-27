package encapsulation;

import java.util.Scanner;

public class studentdetails {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	student1 st=new student1();
	System.out.println("Enter the name");
	st.setName(s.next());
	System.out.println("Enter the id");
    st.setId(s.nextInt());
     System.out.println("Enter the department");
     st.setDpt(s.next());
     System.out.println("*****STUDENT DETAILS*****");
     System.out.println(st.getName());
     System.out.println(st.getId());
     System.out.println(st.getDpt());
     
     
	}

}
