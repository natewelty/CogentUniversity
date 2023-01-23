package com.cogent;

import java.util.Scanner;
import java.util.function.Predicate;

public class LengthOfStrength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Predicate<Integer> pred =x->(x>=20);
		System.out.print("Enter an integer: ");
		int x = sc.nextInt();
		if(pred.test(x)) {
			System.out.println(x + " is larger than 20.");
		}
	}
	
	
}
