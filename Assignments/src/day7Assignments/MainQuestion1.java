package day7Assignments;

public class MainQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentTest stu = new StudentTest();
		stu.addStudent();
		stu.addStudent();
		stu.addStudent();
		stu.addStudent();
		stu.displayStudents();
		stu.searchName(3);
		stu.searchName("Jacob");
		stu.removeName("Schmidt");
		stu.displayStudents();
	}

}
