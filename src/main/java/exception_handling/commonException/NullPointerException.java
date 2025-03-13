package exception_handling.commonException;

public class NullPointerException {
	public static void main(String[] args) {
		
		// Reference set to null
		String s = null;
		
		// Throws NullPointerException
		System.out.println(s.length());
	}
}


