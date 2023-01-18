/**
 * 
 */
package Day1Assignments;

/**
 * @author : Nate
 * @date   : Jan 17, 2023
 * 
 */
public class testMatrix {
	public static void main(String[] args) {
		Matrix testMat1 = new Matrix(2,3);
		testMat1.setElement(0, 0, 1);
		testMat1.setElement(0, 1, 2);
		testMat1.setElement(0, 2, 3);
		testMat1.setElement(1, 0, 9);
		testMat1.setElement(1, 1, 8);
		testMat1.setElement(1, 2, 7);
		testMat1.displayMat();
		Matrix testMat2 = testMat1.transpose();
		testMat2.displayMat();
	}
}
