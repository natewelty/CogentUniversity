package Day1Assignments;

public class Employee {
	int number;
	String name;
	Date startDate;
	
	public Employee(int number, String name, Date startDate) {
		this.number=number;
		this.name=name;
		this.startDate=startDate;
	}
	
	public void displayInfo() {
		System.out.print("Number: " + number + ". Name: " + name + ". Start date: ");
		startDate.displayDate();
	}
}
