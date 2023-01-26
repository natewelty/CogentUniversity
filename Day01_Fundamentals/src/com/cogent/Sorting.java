package com.cogent;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[] = {54, 23, 17, 12, 234, 19, 60};
		
		for(int i:a) {
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(a);
		for(int i:a) {
			System.out.print(i + " ");
		}
		
		String s[] = {"z", "b","x","t"};
		Arrays.sort(s);
		for(String i:s) {
			System.out.print(i + " ");
		}
		
	}

}
