package day2Assignments;

public class SportCar extends Car {
	String airBallonType;
	public void setAirBallonType(String type) {
		airBallonType = type;
	}
	
	@Override
	public void display() {
		super();
		System.out.println("The air ballon type is " + airBallonType);
		
	}
}
