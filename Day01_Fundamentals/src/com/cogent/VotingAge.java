package com.cogent;

import java.util.Scanner;
import java.util.function.Predicate;

public class VotingAge {
	public static void main(String[] args) {
		Predicate<Integer> p = (x)->(x>20);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age.");
		int age = sc.nextInt();
		if(p.test(age)) {
			System.out.println("You are eligible to vote.");
		}
		else {
			System.out.println("You are not eligible to vote.");
		}
	}
}
