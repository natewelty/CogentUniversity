package day7Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {

	public static void main(String[] args) {
		ArrayList<StudentComparable> stuCo = new ArrayList<>();
		stuCo.add(new StudentComparable(1,"John"));
		stuCo.add(new StudentComparable(2,"Jacob"));
		stuCo.add(new StudentComparable(3,"Jingleheimer"));
		stuCo.add(new StudentComparable(4,"Schmidt"));
		stuCo.add(new StudentComparable(5,"Henry"));
		
		ArrayList<StudentComparable> stuCo2 = new ArrayList<>(stuCo);
		
		
		
		for(StudentComparable student:stuCo) {
			System.out.println(student);
		}
		Collections.sort(stuCo);
		for(StudentComparable student:stuCo) {
			System.out.println(student);
		}
		
		
		for(StudentComparable student:stuCo2) {
			System.out.println(student);
		}
		Collections.sort(stuCo2, new StudentComparator());
		for(StudentComparable student:stuCo2) {
			System.out.println(student);
		}
		
		
		
	}

}
