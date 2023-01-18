package day2Assignments;

import java.util.concurrent.ThreadLocalRandom;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] prescription = new Medicine[10];
		int randomNum;
		for(int i = 0; i<10; i++) {
			randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			if(randomNum == 1) {
				prescription[i]= new Tablet();
			}
			else if (randomNum == 2) {
				prescription[i]= new Syrup();
			}
			else if(randomNum == 3) {
				prescription[i] = new Ointment();
			}
			prescription[i].displayLabel();
		}
			
		

	}

}
