import java.util.*;
public class Person {
	String name;
	String address;
	String phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	String emailAddress;
	public Person() {
		this.name = "Daniel";
		
	}
	
	public Person(String name, String address, String phoneNumber, String emailAddress){
		
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		
	}
	@Override
	public String toString() {
		return "Class name person and person name: " + this.name;
	}
	
	public static void main(String[] args) {
		
		Person one = new Person("Daniel", "10 Figer", "3234546767", "dster@pacbell.net");
		Person two = new Student();
		//
		System.out.println(two.toString());
//		Student student = new Student();
//		System.out.println(student.toString());
		
				
		
	}

}

class Student extends Person{
	final int FRESHMAN = 1;
	final int SOPHMORE = 2;
	final int JUNIOR = 3;
	final int SENIOR = 4;
	
	public Student() {
//		super();
		
	}

	@Override
	public String toString() {
		 
		
		return "Class name Student and person name: " + super.name;
	}
	
}

class Employee extends Person{
	String office;
	long salary;
	Date date;

	public Employee() {
	
	}
	@Override
	public String toString() {
		System.out.println("Class name Employee and person name: " + this.name);
		
		return "";
	}
		
}

class Faculty extends Employee{
	int officeHours;
	int rank;
	
	public String toString() {
		System.out.println("Class name Faculty and person name: " + this.name);
		
		return "";
	}
}

class Staff extends Employee{
	String title;
	
	public String toString() {
		System.out.println("Class name Staff and person name: " + this.name);
		
		return "";
	}
	



	}
	

