package exception_handling.try_with_resources.demo1;

// Checked Custom Exception
public class MyIncorrectFileException extends Exception {
	public MyIncorrectFileException(final String errorMessage) {
		super(errorMessage);
	}
	
	public MyIncorrectFileException(final String errorMessage, Throwable error) {
		super(errorMessage, error);
	}
	
}
