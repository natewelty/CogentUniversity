/**
 * 
 */
package Day1Assignments;

/**
 * @author : Nate
 * @date   : Jan 16, 2023
 * 
 */
public class testPolynomial {
	public static void main(String[] args) {
		Polynomial f = new Polynomial(3);
		System.out.println("Test Polynomial runs.");
		f.displayTerms();
		f.setTerm(3, 4);
		f.displayTerms();
		f.setTerm(1,2);
		f.setTerm(2, 3);
		f.displayTerms();
		f.setTerm(5,6);
		f.sort();
		f.displayTerms();
	}
}
