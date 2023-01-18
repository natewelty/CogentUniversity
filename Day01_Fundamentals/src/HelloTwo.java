/**
 * 
 */

/**
 * @author : Nate
 * @date   : Jan 16, 2023
 * 
 */
import java.util.Scanner;

public class HelloTwo {
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter integer:");
		int input = myInput.nextInt();
		HelloTwo.evenNumberCount(input);
		
	}
	
	static void evenNumberCount(int n) {
		
		for(int i=0;i<=n;i++) {
			if (i%2==0){
				System.out.println(i);
			}
		}
	}
}

class Rectangle {
	
	
}
