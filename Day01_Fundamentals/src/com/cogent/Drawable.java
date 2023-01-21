package com.cogent;

public interface Drawable {
	public enum Unit{
		pixel, inch, millimeter
	}
	public default void draw(){
		System.out.println("This is a default method.");
	}
	public static Unit getStandardUnity(){
		System.out.println("This is a static method.");
		return Unit.pixel;
	}
}


