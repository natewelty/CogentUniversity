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
		cat.breathe();
		cat.sneeze();
		//Animal stanimal = new Cat();
		//Dog dog = (Dog) stanimal;
		Dog dog = new Dog();
		dog.bark();
		dog.breathe();
		dog.sneeze();
		
	}

}
