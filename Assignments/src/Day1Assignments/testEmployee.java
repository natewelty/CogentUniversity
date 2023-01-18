package Day1Assignments;

public class testEmployee {

	public static void main(String[] args) {
		//create 5 employees
		Employee[] employees = new Employee[5];
		
		employees[0]= new Employee(1, "John",new Date(1,1,2023));
		employees[1]= new Employee(2, "James",new Date(2,3,2012));
		employees[2]= new Employee(3, "Jim",new Date(4,5,2018));
		employees[3]= new Employee(4, "Jordan",new Date(7,12,2015));
		employees[4]= new Employee(5, "Jason",new Date(5,5,2016));
		
		for(int i = 0; i<5; i++) {
			employees[i].displayInfo();
		}
	}

}
