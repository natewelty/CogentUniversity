import java.util.Scanner;
import java.util.function.Function;


public class Hello7 {
//	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		Function<String,String> upper = s ->s.toUpperCase();
		
		System.out.println(upper.apply(input));
	}
	
	
}
