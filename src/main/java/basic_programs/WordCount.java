package basic_programs;

public class WordCount {
	public static void main(String[] args) {
		String sentence = "Java is a language";
		int wordCount = 0;
		
		// Split the sentence into words using space as a delimiter
		String[] words = sentence.split(" ");
		
		// Iterate through the words and count them
		for (String word : words) {
			// Remove punctuation from the word (if needed)
			word = word.replaceAll("[^a-zA-Z]", "");
			
			// Check if the word is not empty
			if (!word.isEmpty()) {
				wordCount++;
			}
		}
		
		System.out.println("Word count: " + wordCount);
	}
}
