/**
 * 
 */
package MakingAnimals;

/**
 * @author : Nate
 * @date   : Jan 17, 2023
 * 
 */
public class Dog extends Animal{
	public void bark() {
		System.out.println("woof woof");
	}
	@Override
	public void sneeze() {
		System.out.println("Extra loud dog sneeze");
		//new super().sneeze();
	}
}
