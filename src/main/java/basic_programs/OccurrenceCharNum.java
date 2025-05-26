package basic_programs;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceCharNum {
	public static void main(String[] args) {
		String str = "well123 pooja234";
		int count = 0;
		String s = str.replaceAll(" ", "");
		System.out.println(s);
		int length = s.length();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if (map.containsKey(s.charAt(i))) {
				count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			} else
				map.put(s.charAt(i), 1);
		}
		System.out.println(map);
	}
}