package day4Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class QuestionFour {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileReader fr = null;
		FileWriter fw = null;
		File storedString = new File("C:/Users/nate/Documents/demo.txt");
		
		System.out.println("Enter the input string:");
		
		String inputString = br.readLine();
		
		fw = new FileWriter(storedString);
		int ch;
		fw.write(inputString);
		fw.close();
		System.out.println("The file size in bytes is " + storedString.length());
		fr = new FileReader(storedString);
		while((ch =fr.read())!=-1) {
			System.out.print((char)ch);
		}
		System.out.println();
		fr.close();
		storedString.delete();

	}

}
