package day4Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		File inputFile = new File(args[0]);
		File outputFile = new File(args[1]);
		Scanner sc = new Scanner(System.in);
		
		if(outputFile.length()>0) {
			System.out.println("Would you like to overwrite the file " + args[1] + "? Y/N");
			String choice = sc.nextLine();
			if (choice.equals("N")) {
				System.out.println("Enter a new file name:");
				choice = sc.nextLine();
				outputFile = new File(choice);
			}
		}
		try {
			FileReader fr = new FileReader(inputFile);
			FileWriter fw = new FileWriter(outputFile);
			int ch;
			while((ch = fr.read())!=-1) {
				fw.write(ch);
			}
			
		}catch(FileNotFoundException io) {
			io.printStackTrace();
			System.out.println("Input file does not exist.");
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		
		
	}

}
