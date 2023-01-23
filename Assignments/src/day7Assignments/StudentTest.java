package day7Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
	ArrayList<Student> students;
	Scanner sc = new Scanner(System.in);
	public StudentTest() {
		students = new ArrayList<Student>();
	}
	public void addStudent() {
		System.out.println("Enter roll number: ");
		int rollNumber = sc.nextInt();
		System.out.println("Enter student name: ");
		String name = sc.next();
		System.out.println("Enter student age: ");
		int age = sc.nextInt();
		System.out.println("Enter student email address: ");
		String email = sc.next();
		Student newStudent = new Student(rollNumber,name,age,email);
		students.add(newStudent);
		
	}
	public void displayStudents() {
		for(Student student:students) {
			student.displayDetails();
		}
	}
	public void searchName(int index) {
		students.get(index).displayDetails();
	}
	public void searchName(String name) {
		boolean found = false;
		for(Student student:students) {
			if (student.getName().compareTo(name)==0) {
				student.displayDetails();
				found = true;
			}
		}
		if (!found) {
			System.out.println("There is no such student.");
		}
	}
	public void removeName(String name) {
		boolean found = false;
		int index=-1;
		for(Student student:students) {
			if (student.getName().compareTo(name)==0) {
				index = students.indexOf(student);
				found = true;
			}
		}
		if(found) {
			students.remove(index);
		}
		else if (!found) {
			System.out.println("There is no such student.");
		}
	}
	
}
