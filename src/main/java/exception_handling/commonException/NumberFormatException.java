package exception_handling.commonException;

public class NumberFormatException {
	public static void main(String[] args) {
		
		//Data type mismatch between input string value and the type of the method which is being used for parsing
		int value = Integer.parseInt("0.78");
		//Integer.parseInt("null") ;
		//Float.parseFloat(“ ”) ;
		//Integer.valueOf(“31.two”);
		System.out.println(value);
	}
}


