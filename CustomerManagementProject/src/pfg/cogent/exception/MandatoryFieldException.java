package pfg.cogent.exception;

public class MandatoryFieldException extends RuntimeException {
	public MandatoryFieldException(String errorMessage) {
		super(errorMessage);
	}
}
