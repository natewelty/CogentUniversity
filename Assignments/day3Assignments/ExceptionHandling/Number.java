package ExceptionHandling;

public class Number {
	int firstNumber, secondNumber;
	double result;
	public Number(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public void add() {
		result = firstNumber + secondNumber;
	}
	public void sub() {
		result = firstNumber - secondNumber;
	}
	public void mul() {
		result = firstNumber * secondNumber;
	}
	public void div() {
		if (secondNumber == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		
		result = firstNumber / secondNumber;
	}
}
