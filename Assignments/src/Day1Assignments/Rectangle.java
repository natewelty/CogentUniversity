/**
 * 
 */
package Day1Assignments;

/**
 * @author : Nate
 * @date   : Jan 16, 2023
 * 
 */
public class Rectangle {
	float length, breadth;
	/**
	 * 
	 */
	public Rectangle() {
		length=breadth=0;
	}
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth=breadth;
	}
	
	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}	
	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		this.length = length;
	}
	
	/**
	 * @return the length
	 */
	public float getLength() {
		return length;
	}
	public float getBreadth() {
		return breadth;
	}
	
	public float computeArea() {
		return length*breadth;
	}
}
