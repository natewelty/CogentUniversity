package com.cogent;


import java.util.Date;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*BiFunction<Integer,Integer,Integer> calculator=(x,y)->x*y;
		Function<Integer,Double> circle = (r)->3.14*r*r;
		
		System.out.println("Enter the length:");
		int length = sc.nextInt();
		System.out.println("Enter the width:");
		int width = sc.nextInt();
		System.out.println("The area of the rectangle is " + calculator.apply(length,width));
		System.out.println("Enter the radius.");
		int radius= sc.nextInt();
		System.out.println("The area of the circle is " + circle.apply(radius));
		
		Consumer<Integer> display = (x)->System.out.println("I have accepted " + x);
		display.accept(100);
		
		Supplier<Date> day = ()->new Date();
		System.out.println(day.get());*/
		/*Consumer<StringBuffer> reversal1=(s)->System.out.println(s.reverse());
		Function<String, String> reversal2 = (s)-> new StringBuffer(s).reverse().toString();
		System.out.println("Enter your string.");
		String input = sc.nextLine();
		StringBuffer sb = new StringBuffer(input);
		reversal1.accept(sb);
		System.out.println(reversal2.apply(input));*/
		MyClass mc = new MyClass();
		MyInterface f1 = mc::alternateMethod;
		f1.myMethod(12);
	}
}

class MyClass{
	public void alternateMethod(int i) {
		System.out.println("The value is " + i);
	}
}
