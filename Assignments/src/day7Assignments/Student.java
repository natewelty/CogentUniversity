package day7Assignments;

public class Student {
	int rollNo;
	String name;
	int age;
	String email;
	public Student(int rollNo, String name, int age, String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public void displayDetails() {
		System.out.println("Student roll number is " + getRollNo());
		System.out.println("Student name is " + getName());
		System.out.println("Student age is " + getAge());
		System.out.println("Student email is " + getEmail());
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
