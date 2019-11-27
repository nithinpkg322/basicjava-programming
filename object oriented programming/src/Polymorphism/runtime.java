package Polymorphism;

import java.util.Scanner;

public class runtime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Car c=new Car();
		Bike bk=new Bike();
		System.out.println("1)Bike\n2)Car\n");
		int op;
		op = s.nextInt();
		switch(op)
		{
		case 1:
		{
		System.out.println("Enter the details of bike");
		System.out.println("Enter the color of bike");
		bk.setColor(s.next());
		System.out.println("Enter the maximum speed");
		bk.setSpeed(s.nextInt());
		System.out.println("Enter the number of seats");
		bk.setSeat(s.nextInt());
		System.out.println("Enter the number of wheels");
		bk.setWheel(s.nextInt());
		System.out.println("Enter the status of disk break(true/false)");
		bk.setDisk(s.next());
		bk.display();
		break;
		}
		case 2:
		{
		System.out.println("Enter the details of car");
		System.out.println("Enter the color of car");
		c.setColor(s.next());
		System.out.println("Enter the maximum speed");
		c.setSpeed(s.nextInt());
		System.out.println("Enter the number of seats");
		c.setSeat(s.nextInt());
		System.out.println("Enter the number of wheels");
		c.setWheel(s.nextInt());
		System.out.println("Enter the number of doors");
		c.setDoors(s.nextInt());
		System.out.println("Enter the status of AC(true/false)");
		c.setDisk(s.next());
		c.display();
		break;

		}
		default:
		{
		System.out.println("Invalid Option");
		}
		}

		}
		}
		class Vehicle
		{  

		int speed,seat,wheel,doors;
		String color,disk;

		public int getSpeed() {
		return speed;
		}


		public void setSpeed(int speed) {
		this.speed = speed;
		}


		public int getSeat() {
		return seat;
		}


		public void setSeat(int seat) {
		this.seat = seat;
		}


		public int getWheel() {
		return wheel;
		}


		public void setWheel(int wheel) {
		this.wheel = wheel;
		}


		public int getDoors() {
		return doors;
		}


		public void setDoors(int doors) {
		this.doors = doors;
		}


		public String getColor() {
		return color;
		}


		public void setColor(String color) {
		this.color = color;
		}


		public String getDisk() {
		return disk;
		}


		public void setDisk(String disk) {
		this.disk = disk;
		}


		public void display()
		{


		}

		}
		class Car extends Vehicle
		{
		Vehicle v=new Vehicle();
		public void display()
		{  
		System.out.println("Car Details");
		System.out.println("Color: " +color);
		System.out.println("Maximum speed: "+speed);
		System.out.println("Number of seats: " +seat);
		System.out.println("Number of wheel: "+wheel);
		System.out.println("Number of doors" +doors);
		System.out.println("AC: "+disk);



		}
		}
		class Bike extends Vehicle
		{


		public void display()
		{

		System.out.println("Bike Details");
		System.out.println("Color: " +color);
		System.out.println("Maximum speed: "+speed);
		System.out.println("Number of seats: " +seat);
		System.out.println("Number of wheel: "+wheel);
		System.out.println("AC"+disk);


		}
		}


