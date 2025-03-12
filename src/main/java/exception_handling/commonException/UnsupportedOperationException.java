package exception_handling.commonException;

import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationException {
	public static void main(String[] args) {
		String str[] = {"Apple", "Banana"};
		List<String> l = Arrays.asList(str);
		System.out.println(l);
		
		// It will throw java.lang.UnsupportedOperationException
		
		l.add("Mango");
	}
}
