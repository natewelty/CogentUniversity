package day7Assignments;

public class StudentComparable implements Comparable<StudentComparable>{
	private int rollNo;
	private String name;
	public StudentComparable(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return rollNo + " " + name;
	}
	
	public int compareTo(StudentComparable o) {
		if (this.name.length()> o.name.length()) {
			return 1;
		}
		if (this.name.length()==o.name.length()) {
			return 0;
		}
		return -1;
	}

	
}
