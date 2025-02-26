package exception_handling.try_with_resources.demo2;

public class MyNoFileExtensionException extends RuntimeException {
	public MyNoFileExtensionException(final String errorMessage, Throwable error) {
		super(errorMessage, error);
	}
	
	
}
