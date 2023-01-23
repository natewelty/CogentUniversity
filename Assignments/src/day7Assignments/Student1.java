package day7Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student1 {
	private ArrayList<String> names;
	public Student1() {
		names = new ArrayList<String>();
	}
	public void setNames() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student to add.");
		String name = sc.nextLine();
		names.add(name);
	}
	public void searchName(String name) {
		int index = names.indexOf(name);
		if(index>=0) {
			System.out.println("The index of that student is " + index);
		}
		else {
			System.out.println("That student was not found.");
		}
	}
	public void searchName(int index) {
		if(names.get(index)!=null) {
			System.out.println("The name of the student at that index is " +names.get(index));
		}
		else {
			System.out.println("There is no student at that index.");
		}
	}
	public void printNames() {
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void removeName(String name) {
		int index = names.indexOf(name);
		if(index>=0) {
			names.remove(index);
		}
		else {
			System.out.println("No such student was found.");
		}
	}
}
