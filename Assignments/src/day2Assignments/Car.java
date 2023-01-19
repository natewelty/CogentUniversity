package day2Assignments;

public class Car {
	int speed,noOfGears;
	
	public void drive(int speed, int noOfGears) {
		System.out.println("Driving the car.");
	}
	public void display() {
		System.out.println("The current speed is " + speed);
		System.out.println("The number of gears is " + noOfGears);
	}
}
