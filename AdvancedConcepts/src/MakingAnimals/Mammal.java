/**
 * 
 */
package MakingAnimals;

/**
 * @author : Nate
 * @date   : Jan 17, 2023
 * 
 */
public interface Mammal {
	public void eat();
	public void move();
	public void sleep();
	public default void breathe() {
		System.out.println("animals breathe");
	}
	public default void sneeze() {
		System.out.println("achoo");
	}
}
