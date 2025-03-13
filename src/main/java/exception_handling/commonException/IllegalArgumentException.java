package exception_handling.commonException;

import java.util.ArrayList;
import java.util.List;

public class IllegalArgumentException {
	public static void main(String[] args) {
		
			
			// Example 1
			List<String> list = new ArrayList<>(-10);
			list.add("a");
			list.add("b");
			list.add("c");
		}
	}

