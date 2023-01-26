package day7Assignments;

public class TestHashMap {

	public static void main(String[] args) {
		StudentQ2 testStudent = new StudentQ2();
		testStudent.setName(1, "John");
		testStudent.setName(2, "Jacob");
		testStudent.setName(3, "Jingleheimer");
		testStudent.setName(4, "Schmidt");
		
		testStudent.printNames();
		testStudent.printNamesKeySet();
		testStudent.remove(3);
		testStudent.printSize();
	}

}
