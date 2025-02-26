package exception_handling.control_flow;

public class FinallyExceptionExample {
	
		public static void main(String[] args) {
			try {
				methodWithException();
			} catch (NullPointerException e) {
				System.out.println("Caught Exception: " + e.getMessage());
			} catch (ArithmeticException e) {
				System.out.println("Caught Exception - ARITHMETIC: " + e.getMessage());
			}
			
		}
		
		public static void methodWithException() throws ArithmeticException {
			try {
				System.out.println("Inside try block");
				throw new ArithmeticException("Exception from try block");
			} catch (ArithmeticException e) {
				System.out.println("Inside catch block");
				throw e; // Rethrowing exception
			} finally {
				System.out.println("Inside finally block");
				throw new ArithmeticException("Exception from finally block"); // This suppresses the original exception
			}
		}
}
