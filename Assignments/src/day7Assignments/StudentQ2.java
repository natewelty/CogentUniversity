package day7Assignments;

import java.util.HashMap;

public class StudentQ2 {
	private HashMap<Integer,String> empNames = new HashMap<>();
	
	public void setName(int rollNo, String name) {
		 empNames.put(rollNo,name);
	}
	public void printNames() {
		for(String i:empNames.values()) {
			System.out.println(i);
		}
	}
	public void getName(int key) {
		System.out.println(empNames.get(key));
	}
	public void printNamesKeySet() {
		for(int i:empNames.keySet()) {
			System.out.println(empNames.get(i));
		}
	}
	public void printSize() {
		System.out.println(empNames.size());
	}
	public void remove(int key) {
		empNames.remove(key);
	}
	
}
