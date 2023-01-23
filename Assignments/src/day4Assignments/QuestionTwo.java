package day4Assignments;

import java.io.*;
import java.util.Scanner;


public class QuestionTwo {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		ObjectInputStream ois;
		FileInputStream fis;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String response = null;
		boolean choice = false;
		int directoryCount = 0;
		try{
			File file = new File("C:/Users/nate/Documents/Directory.ser");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			do {
				
				try {
					System.out.println("Enter the roll number.");
					Integer rollNo = Integer.parseInt(br.readLine());
					System.out.println("Enter the name.");
					String name = br.readLine();
					System.out.println("Enter the age.");
					Integer age = Integer.parseInt(br.readLine());
					System.out.println("Enter the address.");
					String address = br.readLine();
					
					System.out.println("Would you like to save this record to the directory? Y/N");
					response = br.readLine();
					if(response.compareToIgnoreCase("Y")==0) {
						choice = true;
						if(rollNo == null || name==null || age==null || address==null) {
							throw new MandatoryFieldException("No field may be left blank.");
						}
						DirectoryInfo record = new DirectoryInfo(rollNo,name,age,address);
						oos.writeObject(record);
						System.out.println("Record saved.");
						directoryCount++;
					}
					else {
						choice = false;
					}
				}catch(IOException io ) {
					
					io.printStackTrace();
				
				}catch(NumberFormatException nfe) {
					nfe.printStackTrace();
					System.out.println("Roll number and age must be positive integers");
				}
				
			}while(choice);
			for(int i=0; i<directoryCount;i++) {
				try {
					Object obj = ois.readObject();
					DirectoryInfo record = (DirectoryInfo) obj;
					record.display();
				}catch(ClassNotFoundException cnfe) {
					cnfe.printStackTrace();
				}
				
			}
			
		}catch(IOException io) {
			io.printStackTrace();
		}
		
		
		
		
	}

}

class DirectoryInfo implements Serializable{
	int rollNo, age;
	String name, address;
	public DirectoryInfo(int rollNo, String name, int age, String address) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println("Roll Number: " +rollNo);
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Address: " +address);
	}
}

class MandatoryFieldException extends RuntimeException{
	public MandatoryFieldException(String errorMessage) {
		super(errorMessage);
	}
}
