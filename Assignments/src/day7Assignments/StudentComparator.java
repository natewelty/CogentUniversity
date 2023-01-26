package day7Assignments;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparable> {

	@Override
	public int compare(StudentComparable o1, StudentComparable o2) {
		if (o1.getName().length()> o2.getName().length()) {
			return 1;
		}
		if (o1.getName().length()==o2.getName().length()) {
			return 0;
		}
		return -1;// TODO Auto-generated method stub
		
	}
	
}
