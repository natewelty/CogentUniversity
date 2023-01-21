package ExceptionHandling;

public class USERTRAIL {
	int val1, val2;

	public USERTRAIL(int val1, int val2) {
		super();
		if(!show()) {
			throw new IllegalValueException("val1 or val2 must be greater than zero.");
		}
		this.val1 = val1;
		this.val2 = val2;
	}
	public boolean show() {
		if(val1<0 && val2<0) {
			return false;
		}
		else {
			return true;
		}
	}
}

class IllegalValueException extends RuntimeException{
	public IllegalValueException(String errorMessage) {
		super(errorMessage);
	}
}