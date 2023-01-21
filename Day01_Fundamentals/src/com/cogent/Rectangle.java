package com.cogent;

import java.util.Objects;

public class Rectangle {
	int length,breadth,area;
	
	public Rectangle(int length, int breadth) {
		this.breadth=breadth;
		this.length=length;
		area=breadth*length;
	}
	
	@Override
	public String toString() {
		return "Rectangle["+length +"x" + breadth+", area:" + area +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		Rectangle other = (Rectangle) obj;
		return length==other.length && breadth==other.breadth;
	}

}
