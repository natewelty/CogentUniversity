package day2Assignments;

import java.util.concurrent.ThreadLocalRandom;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] train = new Compartment[10];
		int compartmentGenerator;
		for(int i = 0; i<10;i++) {
			
			compartmentGenerator = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			if (compartmentGenerator==1) {
				train[i]=new FirstClass();
			}
			else if (compartmentGenerator==2) {
				train[i]=new Ladies();
			}
			else if (compartmentGenerator==3) {
				train[i]=new General();
			}
			else if (compartmentGenerator==4) {
				train[i]=new Luggage();
			}
		}
		
		for(int i = 0; i<10;i++) {
			train[i].notice();
		}
		
	}

}
