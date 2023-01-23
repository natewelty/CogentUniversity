package day4Assignments;

import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class QuestionSix {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		try {
			FileWriter fw = new FileWriter("C:/Users/nate/Documents/rated_cdr.txt");
			System.out.println("Enter first caller number:");
			String A_Number = br.readLine();
			System.out.println("Enter second caller number:");
			String B_Number = br.readLine();
			System.out.println("Enter call duration:");
			Float duration = Float.parseFloat(br.readLine());
			//oos.writeObject(record);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class CDR implements Serializable{
	String A_Number, B_Number;
	float duration, calculatedCharge;
	public CDR(String a_Number, String b_Number, float duration) {
		super();
		A_Number = a_Number;
		B_Number = b_Number;
		this.duration = duration;
		calculatedCharge = duration;
	}
}