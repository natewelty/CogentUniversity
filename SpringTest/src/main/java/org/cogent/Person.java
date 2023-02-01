package org.cogent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	int ID;
	String name;
	int age;
	
	@Autowired
	Country country;

	

	public Person(int iD, String name, int age) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
	}

	public void showPerson() {
		System.out.println(toString());
		System.out.println(country.toString());
	}
	
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + ", age=" + age +"]";
		
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
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



	public Country getCountry() {
		return country;
	}



	public void setCountry(Country country) {
		this.country = country;
	}
	
	

}
