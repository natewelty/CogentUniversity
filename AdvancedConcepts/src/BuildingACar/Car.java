/**
 * 
 */
package BuildingACar;

/**
 * @author : Nate
 * @date   : Jan 17, 2023
 * 
 */
public class Car {
	private Engine engine;
	private MusicSystem ms;
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public MusicSystem getMusicSystem() {
		return ms;
	}
	public void setMusicSystem(MusicSystem ms) {
		this.ms=ms;
	}
	public void start() {
		System.out.println("Car engine " + this.engine.getType() + "started.");
	}
	public void stop() {
		System.out.println("Car engine " + this.engine.getType() + "stopped.");
	}
	public void displayMusicSystemInfo() {
		System.out.println("Music System ID: " + this.ms.getId());
		System.out.println("Music System Type: " + this.ms.getType());	
	}
	
}
