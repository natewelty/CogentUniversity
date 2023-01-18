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
		length=breadth=1;
	}
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth=breadth;
	}
	
	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(float breadth) {
		if(breadth>0.0 && breadth<20.0) {
			this.breadth = breadth;
		}
		else {
			System.out.println("Side lengths must be between 0.0 and 20.0.");
		}
	}	
	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		if(length>0.0 && length<20.0) {
			this.length = length;
		}
		else {
			System.out.println("Side lengths must be between 0.0 and 20.0.");
		}
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
	
	public float computePerimeter() {
		return 2*length+2*breadth;
	}
}
