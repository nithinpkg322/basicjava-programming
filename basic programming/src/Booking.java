import java.util.*;
public class Booking {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Book bk=new Book();
        
        String name[]=new String[25];
        int i=1;
        String proceed;
        String proceed1;
        String email[]=new String[25];
        do
        {
    
        System.out.println("REGISTRATION");
        System.out.println("Enter your name");
        name[i]=s.nextLine();
        System.out.println("Enter your address");
        String address=s.nextLine();
        System.out.println("Contact Number");
        String contactno=s.nextLine();
        System.out.println("E-Mail ID");
        email[i]=s.nextLine();
        System.out.println(" Enter proof type");
        String prooftype=s.nextLine();
        System.out.println(" Enter proof id");
        String proofid=s.nextLine();
        
        System.out.println("Do you want to book a room (yes/no)?");
         proceed=s.next();
        if(proceed.equals("yes")==true)
        {
            System.out.println("Thank you for registering. Your id is "+i);
            
            bk.booking();
            
        
        }i++;
        System.out.println("Do you want to Continue yes/no");
        proceed1=s.next();
        }while(proceed1.equals("yes")==true);
        bk.show();
        System.out.println("   id    name    email     "+"\n ");
        for(int k=1;k<i;k++)
        {
        System.out.println(k+"    "+name[k]+"        "+email[k]); 
        }    
    
    }}
    class Book
    {
        Scanner s=new Scanner(System.in);
        String ac;
        String cot;
        String cable;
        String wifi;
        String laundry;
         Date date;
        double total=0;
        double a,b,c,d,e,f;
       String proceed2;
    void booking() {
        
        
        System.out.println("BOOKING");
        System.out.println("Choose Your needs");
        System.out.println("AC/nonAC");
        ac=s.nextLine();
        if(ac=="AC") {
            a=800;

            }
        else {
            a=500;
        
           
            }
        
            System.out.println("Single or Double(S/D)");
            cot=s.nextLine();
        if(cot=="S") {
            b=50;
            
            }
        else
           {b=100;
           
           }
                System.out.println("Cable(Withc/withoutc)");
        cable=s.nextLine();
        
        if(cable=="withc") {
            c=100;
           
            }
        else {
            c=0;
            
            }
        System.out.println("wifi(wifi/nwifi)");
        wifi=s.nextLine();
        if(wifi=="wifi") {
            d=100;

            }
        else {
            d=0;
          
            }
        
        
        System.out.println("laundry(Y/N)");
        laundry=s.nextLine();
        if(laundry=="Y") {
            e=200;
    
            }
        else {
            e=0;
           
            }
        
        total=a+b+c+d+e;
        System.out.println("Total Amount is="+total);
        }
    
        
    
void show()
        
        {
            System.out.println("Services choosen are");
            if(a==800) {
                
                System.out.println("AC");    }
            else {
            
                System.out.println("NON_AC");}
        
            if(b==100) {
            
                System.out.println("Single cot");    }
            else
               {
                System.out.println("double cots");}
            
            
            
            if(c==100) {
                
                System.out.println("with cable");    }
            else {
            
                System.out.println("without cable");}
            if(d==100) {
            
                System.out.println("wifi");    }
            else {
            
                System.out.println("No wifi");}
            
            
            if(e==200) {
            
                System.out.println("laundry");    }
            else {
            
                System.out.println("no laundry");}
            System.out.println("Enter the date");
            int date=s.nextInt();
            System.out.println("do you want to proceed?(yes/no)");
            proceed2=s.next();}
while(proceed2.contentequals("n") );
{
	if(proceed2.equals("y")==true)
{
	System.out.println("thank u for booking/n your room number is "+i);
	i=i+1;
}
	}
        
        
    
}
