package esg.itp.shape;

public class Rectangle implements Polygon {
	float length, breadth, area, perimeter;
	public Rectangle(float length, float breadth) {
		this.length=length;
		this.breadth = breadth;
		calcArea();
		calcPeri();
	}
	
	@Override
	public void calcArea() {
		area= length*breadth;
		System.out.println("The area is " + area);
	}

	@Override
	public void calcPeri() {
		perimeter= 2*length + 2*breadth;
		System.out.println("The perimeter is " + perimeter);

	}

	@Override
	public void display() {
		System.out.println("The area is " + area);
		System.out.println("The perimeter is " + perimeter);
	}
}
