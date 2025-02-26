package exception_handling.control_flow;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UnreachableCatch {
	public static void main(String[] args) {
		try {
			demoException();
		} catch (FileNotFoundException Exception) {
			System.out.println(Exception.getMessage());
		} catch (IOException Exception) {
			System.out.println(Exception.getMessage());
		} catch (NullPointerException Exception) {
			System.out.println(Exception.getMessage());
		}
		
	}
	
	private static void demoException() throws FileNotFoundException {
		System.out.println("if demoException method not written then will get : Cannot resolve method 'demoException' in 'UnreachableCatch'");
	}
}