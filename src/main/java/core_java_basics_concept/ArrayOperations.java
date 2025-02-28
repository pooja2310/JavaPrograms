package core_java_basics_concept;

import java.util.Arrays;
import java.util.List;

public class ArrayOperations {
	public static void main(String[] args) {
		int [] a = {1, 2, 3};
		int [] b = {4, 5, 6, 7};
		int [] c = a;
		
		System.out.println("a: "+ Arrays.toString(a) + "\tAddress of a: "+ a);
		System.out.println("b: "+ Arrays.toString(b) + "\tAddress of b: "+ b);
		a = b;
		System.out.println("After a = b: value of a = " + Arrays.toString(a) + "\tAddress of a: "+ a);
		System.out.println("b: "+ Arrays.toString(b) + "\tAddress of b: "+ b);
		b = a;
		System.out.println("After b = a: value of b = " + Arrays.toString(b) + "\tAddress of b: "+ b);
		b = c;
		System.out.println("After b = c: value of b = " + Arrays.toString(b) + "\tAddress of b: "+ b);
		String [] str= {"a","b"};
		List<String> list1= Arrays.asList(str);
	}
}


