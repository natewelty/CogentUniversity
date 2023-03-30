package AdvancedStuff;

import java.util.Scanner;

public class IntPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		Integer i = sc.nextInt();
		if(isPalindrome(i.toString())) {
			System.out.println("It is a palindrome.");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		String strRev=sb.reverse().toString();
		if(str.compareToIgnoreCase(strRev)==0) {
			return true;
		}
		return false;
	}

}
