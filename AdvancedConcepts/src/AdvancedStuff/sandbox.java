/**
 * 
 */
package AdvancedStuff;

/**
 * @author : Nate
 * @date   : Jan 17, 2023
 * 
 */
public class sandbox {
	
	
	public static void main(String[] args) {
		johnCena jc = new johnCena();
		jc.test();
		jc.test2();
		
	}
}
interface testInterface{
	int x = 1;
	void test();
	void test2();
}

class johnCena implements testInterface{
	public void test() {
		System.out.println("The value of x is " + x);
	}
	public void test2() {
		System.out.println("The value of x is not 2.");
	}
}