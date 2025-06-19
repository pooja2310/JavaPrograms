package basic_programs;

import java.util.HashMap;

public class VowelCount {
	public static void main(String[] args) {
		String inputString = "POOJA";
		countVowels(inputString);
	}
	
	public static void countVowels(String input) {
		
		int count = 0;
		
		// Convert the input string to lowercase to make it case-insensitive
		input = input.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			
			char currentChar = input.charAt(i);
			
			// Check if the current character is a vowel (a, e, i, o, u)
			if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
					currentChar == 'o' || currentChar == 'u') {
				if (map.containsKey(currentChar)) {
					count = map.get(currentChar);
					map.put(currentChar, ++count);
				} else
					map.put(currentChar, 1);
			}
		}
		System.out.println(map);
	}
}

