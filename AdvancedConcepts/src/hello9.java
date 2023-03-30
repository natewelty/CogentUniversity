import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hello9 {
	public static void main(String[] args) {
		hello9 hello = new hello9();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be checked:");
		String input = sc.nextLine();
		if(hello.containsNumber(input)) {
			System.out.println("The string contains a number.");
		}
		else {
			System.out.println("No numbers in the string");
		}
		hello.parseString(input);
		
		
		sc.close();
		
	}
	
	public boolean containsNumber(String input) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}
	
	public void parseString(String input) {
		Pattern numberPattern = Pattern.compile("\\d{10,11}");
		Pattern namePattern = Pattern.compile("[a-zA-Z]+");
		Matcher numberMatch = numberPattern.matcher(input);
		Matcher nameMatch = namePattern.matcher(input);
		numberMatch.find();
		nameMatch.find();
		System.out.println("Name is " +nameMatch.group(0));
		System.out.println("Number is " + numberMatch.group(0));
	}
	public void parseEmails(String input) {
		Pattern pattern = Pattern.compile("[a-zA-Z]+@[a-zA-Z]+\\.com|[a-zA-Z]+@[a-zA-Z]+\\\\.net|[a-zA-Z]+@[a-zA-Z]+\\\\.org");
		Matcher matcher = pattern.matcher(input);
		matcher.find();
		
		
		
	}
}
