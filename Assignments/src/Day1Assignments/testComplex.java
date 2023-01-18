/**
 * 
 */
package Day1Assignments;

/**
 * @author : Nate
 * @date   : Jan 17, 2023
 * 
 */
public class testComplex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Complex alpha = new Complex(1,2);
		Complex beta = new Complex(2, 1);
		
		alpha.display();
		beta.display();
		alpha.add(beta).display();
		beta.add(alpha).display();
		alpha.subtract(beta).display();
		beta.subtract(alpha).display();

	}

}
