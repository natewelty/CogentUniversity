package day2Assignments;

public class musicTest {

	public static void main(String[] args) {
		Instrument[] band = new Instrument[10];
		band[0] = new Flute();
		band[1] = new Guitar();
		band[2] = new Piano();
		band[3] = new Flute();
		band[4] = new Guitar();
		band[5] = new Piano();
		band[6] = new Flute();
		band[7] = new Guitar();
		band[8] = new Piano();
		band[9] = new Flute();
		
		for(int i=0; i<10; i++) {
			band[i].play();
		}
		
		for(int i=0; i<10; i++) {
			if(band[i] instanceof Flute) {
				System.out.println("Flute");
			}
			else if(band[i] instanceof Guitar) {
				System.out.println("Guitar");
			}
			else if(band[i] instanceof Piano) {
				System.out.println("Piano");
			}
		}
	}

}
