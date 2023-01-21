package ExceptionHandling;

public class Emp {
	int empID;
	String empName;
	enum Designation{
		MANAGER, OFFICER, CLERK;
	}
	Designation designation;
	double basic;
	private double hra;
	public Emp(int empID, String empName, Designation designation, double basic) {
		super();
		if(basic<500) {
			throw new LowSalException("Basic is too low.");
		}
		this.empID = empID;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
		calculateHRA();
	}
	
	private void calculateHRA() {
		if (designation.compareTo(Designation.MANAGER)==0){
			hra = .1*basic;
		}
		else if(designation.compareTo(Designation.OFFICER)==0 ) {
			hra = .12*basic;
		}
		else if(designation.compareTo(Designation.CLERK)==0 ) {
			hra = .05*basic;
		}
	}
	
	public void printDET() {
		System.out.println("EmpID: " + empID);
		System.out.println("Emp Name: " + empName);
		System.out.println("Designation: " + designation);
		System.out.println("Baisc: " + basic);
		System.out.println("HRA: " + hra);
	}
}

class LowSalException extends ArithmeticException{
	public LowSalException(String errorMessage) {
		super(errorMessage);
	}
}
