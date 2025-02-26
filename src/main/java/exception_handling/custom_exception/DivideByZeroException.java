package exception_handling.custom_exception;

public class DivideByZeroException extends RuntimeException {
	
	public DivideByZeroException(String errorMessage) {
		super(errorMessage);
	}
	
}
	
