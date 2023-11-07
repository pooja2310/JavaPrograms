package basic_programs;

import java.util.HashMap;

public class WordCount_Hashmap
{
	public static void main(String[] args)
	{
		String str = "this is an interview";
		
		// Split the input string into words
		String[] words = str.split(" ");
		
		// Initialize a HashMap to store word counts
		HashMap<String, Integer> wordCounts = new HashMap<>();
		
		// Count the occurrence of each word
		for (String word : words)
		{
			// Remove any punctuation or whitespace from the word (if needed)
			word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
			
			// Check if the word is already in the HashMap
			if (wordCounts.containsKey(word)) {
				int count = wordCounts.get(word);
				wordCounts.put(word, count + 1);
			} else {
				wordCounts.put(word, 1);
			}
		}
		System.out.println(wordCounts);
		
		// Print the word counts
		for (String word : wordCounts.keySet()) {
			//System.out.println("Word: " + word + " - Count: " + wordCounts.get(word));
		}
	}
}
