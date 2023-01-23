package day7Assignments;

public class ArrayListDemo {

	public static void main(String[] args) {
		Student1 studentList = new Student1();
		studentList.setNames();
		studentList.setNames();
		studentList.setNames();
		studentList.setNames();
		
		studentList.searchName("Jacob");
		studentList.searchName(3);
		studentList.printNames();
		studentList.removeName("Schmidt");
		studentList.printNames();
	}

}
