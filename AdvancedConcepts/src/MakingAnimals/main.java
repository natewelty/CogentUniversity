/**
 * 
 */
package MakingAnimals;

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
		Animal animal = new Cat();
		Cat cat = (Cat) animal;
		cat.meow();
		
		Animal stanimal = new Cat();
		Dog dog = (Dog) stanimal;
		dog.bark();
		
	}

}
