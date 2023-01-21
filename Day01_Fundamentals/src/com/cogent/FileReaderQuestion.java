package com.cogent;


import java.io.*;
import java.util.StringTokenizer;

public class FileReaderQuestion {

	public static void main(String[] args) throws Exception{
		File file = new File("C:/Users/nate/Documents/cogent.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		StringTokenizer tokens = new StringTokenizer(br.readLine()," ");
		System.out.println("The number of words in the file is " + tokens.countTokens());
		br.close();
		fis.close();
	}

}
