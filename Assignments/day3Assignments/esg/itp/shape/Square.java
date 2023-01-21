package esg.itp.shape;

public class Square implements Polygon {
	float side;
	float area;
	float perimeter;
	public Square(float side) {
		this.side=side;
		calcArea();
		calcPeri();
	}
	
	@Override
	public void calcArea() {
		area= side*side;
		System.out.println("The area is " + area);
	}

	@Override
	public void calcPeri() {
		perimeter= 4*side;
		System.out.println("The perimeter is " + perimeter);

	}

	@Override
	public void display() {
		System.out.println("The area is " + area);
		System.out.println("The perimeter is " + perimeter);
	}

}
