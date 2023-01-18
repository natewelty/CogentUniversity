/**
 * 
 */
package Day1Assignments;

/**
 * @author : Nate
 * @date   : Jan 17, 2023
 * 
 */
public class Complex {
	float re, im;
	/**
	 * 
	 */
	public Complex() {
		re=im=0;
	}
	public Complex(float re, float im) {
		this.re=re;
		this.im=im;
	}
	public Complex add(Complex b) {
		Complex sum = new Complex(this.re+b.re, this.im+b.im);
		return sum;
	}
	public Complex subtract(Complex b) {
		Complex sum = new Complex(this.re-b.re, this.im-b.im);
		return sum;
	}
	public void display() {
		System.out.println(re + " + " + im + "i");
	}
}

