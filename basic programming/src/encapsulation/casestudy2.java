package encapsulation;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class casestudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Person t=new Person();
		int i=1;
		System.out.println("Enter Price of a ticket :");
		t.setPrice(s.nextInt());
		System.out.println("Enter Number of Persons :");
		t.setPassengerCount(s.nextInt());

		    for(i=1;i<=t.getPassengerCount();i++)
		    {
		   
		System.out.println("Enter Details for Person "+i+" :");
		System.out.println("Name");
		t.setName(s.next());
		System.out.println("Enter Gender");
		t.setGender(s.next());
		System.out.println("Enter the Age: ");
		t.setAge(s.nextInt());

		   



		} t.calc();

		}}
		class Ticket
		{
		int passengerCount;
		int price;
		int totalAmount;
		public int getPassengerCount() {
		return passengerCount;
		}
		public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
		}
		public int getPrice() {
		return price;
		}
		public void setPrice(int price) {
		this.price = price;
		}
		public int getTotalAmount() {
		return totalAmount;
		}
		public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
		}

		}
		class Person extends Ticket
		{
		String name;
		String gender;
		int age;
		int total,total1=0,total2=0,total3=0,total4=0;
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public String getGender() {
		return gender;
		}
		public void setGender(String gender) {
		this.gender = gender;
		}
		public int getAge() {
		return age;
		}
		public void setAge(int age) {
		this.age = age;
		}
		public void calc()
		{
		
		if(getAge()<16)
		{
		total1=((getPrice()/100)*(50))*getPassengerCount();
		}
		if(getAge()>16&&getAge()<64)
		{
		total2=((getPrice()/100)*(25))*getPassengerCount();
		}
		if(getGender().equals("f"))
		{
		total3=((getPrice()/100)*(10))*getPassengerCount();
		}
		if(getGender().equals("m"))
		{
		total4=getPrice()*getPassengerCount();
		}
		total=total1+total2+total3;
		
		System.out.println("Ticket Details");
		System.out.println("Number of Passengers : "+getPassengerCount());
		System.out.println("Price of a ticket : "+getPrice());
		System.out.println("Total Amount :"+total);
		}


		}
		


	
		
		
		
		
		
		
		

	


