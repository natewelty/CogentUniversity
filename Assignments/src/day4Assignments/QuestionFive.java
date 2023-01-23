package day4Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFive {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a directory path.");
		try {
			File file = new File(br.readLine());
			if(!file.exists()) {
				System.out.println("File does not exist.");
			}
			else {
				File[] containedFiles = file.listFiles();
				for(int i=0; i<containedFiles.length;i++) {
					System.out.println(containedFiles[i].toString().substring(file.toString().length()+1));
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
