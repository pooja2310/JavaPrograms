package basic_programs;

public class ShortestWordString {
	public static void main(String args[]) {
		String text = "Java powerful programming language";
		String[] words = text.split(" "); // Split by spaces
		
		String shortest = words[0]; // Assume first word is shortest
		
		for (String word : words) {
			if (word.length() < shortest.length()) {
				shortest = word;
			}
		}
		System.out.println("Shortest Word :" + shortest);
		
	}
}
