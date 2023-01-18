/**
 * 
 */
package BuildingACar;

/**
 * @author : Nate
 * @date   : Jan 17, 2023
 * 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car hondaCity = new Car();
		Engine engine = new Engine();
		engine.setType("Turbo");
		MusicSystem ms = new MusicSystem();
		ms.setId(1001);
		ms.setType("Sony Enterprise");
		hondaCity.setEngine(engine);
		hondaCity.setMusicSystem(ms);
		
		hondaCity.start();
		hondaCity.stop();
		
		hondaCity.displayMusicSystemInfo();
		
	}

}
