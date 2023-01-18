package Day1Assignments;

public class testDate {

	public static void main(String[] args) {
		Date today = new Date(1,1,2024);
		for(int i = 0;i<366;i++) {
			today.incrementDate();
			System.out.println(today.getDay() + "/" + today.getMonth() + "/" +today.getYear());
		}

	}

}
