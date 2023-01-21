package com.cogent;

import java.util.Objects;

public class ComparingObjects {
	String name;
	int age;
	
	public ComparingObjects(String name, int age) {
		super();
		this.name = name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "ComparingObjects[name=" + name + ", age=" +age+"]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age,name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		ComparingObjects other = (ComparingObjects) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
