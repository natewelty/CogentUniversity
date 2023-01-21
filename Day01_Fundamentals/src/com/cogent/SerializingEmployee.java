package com.cogent;

import java.io.*;

public class SerializingEmployee {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		ObjectInputStream ois;
		FileInputStream fis;
		try {
			File file = new File("C:/Users/nate/Documents/emp.ser");

			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			Employee emp = new Employee(101,"James", 1001);
			oos.writeObject(emp);
			System.out.println("Serialized");

			Object obj = ois.readObject();
			Employee employee = (Employee) obj;
			System.out.println(employee.id + " " + employee.name + " " + employee.salary);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
