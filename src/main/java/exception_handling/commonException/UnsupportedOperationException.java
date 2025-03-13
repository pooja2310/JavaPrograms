package exception_handling.commonException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class UnsupportedOperationException {
	public static void main(String[] args) {
		String str[] = {"Apple", "Banana"};
		List<String> l = Arrays.asList(str);
		System.out.println(l);
		
		// It will throw java.lang.UnsupportedOperationException bcoz size of array is fixed and we are adding element in it.
		l.add("Mango");
		
		
		// It will throw java.lang.UnsupportedOperationException  bcoz we are adding value in empty map
		Map<String, String> emptyMap = Map.of();
		emptyMap.put("Pooja", "Kanavaje");
		
		
		//This is singleton map which takes one entry only. It will throw java.lang.UnsupportedOperationException if we add new entry.
		Map<String, String> map = Collections.singletonMap("Pooja", "Kanavaje");
		System.out.println(map);
		map.put("Aniket", "B");
	}
}
