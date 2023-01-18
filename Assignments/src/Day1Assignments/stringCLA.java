package Day1Assignments;

public class stringCLA {

	public static void main(String[] args) {
		System.out.println("The length of the string is " + args[0].length());
		System.out.println("The string shouted is " + args[0].toUpperCase());
		String reverse = "";
		char ch;
		for(int i=0;i<args[0].length();i++) {
			ch = args[0].charAt(i);
			reverse = ch+reverse;
		}
		System.out.println("The string reversed is " + reverse);
		if(args[0].equals(reverse)) {
			System.out.println("The string is a palindrome.");
		}else {
			System.out.println("The string is not a palindrome.");
		}
	}

}
