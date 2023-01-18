/**
 * 
 */
package Day1Assignments;

/**
 * @author : Nate
 * @date   : Jan 16, 2023
 * 
 */
import java.util.Scanner;

public class TestRectangle {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Input the length of the first rectangle:");
		float length = myInput.nextFloat();
		System.out.println("Input the breadth of the first rectangle:");
		float breadth = myInput.nextFloat();
		
		Rectangle r1 = new Rectangle(length,breadth);
		System.out.println("The area of the rectangle is " + r1.computeArea());
		
	}

}
