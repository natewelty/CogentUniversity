package com.cogent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingReader {
	public static void main(String[] args) {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter your first name.");
			String firstName = br.readLine();
			System.out.println("Please enter your last name.");
			String lastName = br.readLine();
			System.out.println("Please enter your age.");
			String age = br.readLine();
			
			System.out.println(firstName + lastName + age);
			
		}catch(Exception e) {
			System.out.println("Caught the error");
		}*/
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(new File("C:/Users/nate/Documents/demo.txt"));
			fos = new FileOutputStream("C:/Users/nate/Documents/demo2.txt");
			System.out.println("file opened");
			int i;
			while((i=fis.read())!=-1) {
				fos.write((char)i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
