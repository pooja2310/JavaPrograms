package basic_programs;

public class CharcterCount
{
	public static void main(String[] args)
	{
		String str = "this is an interview";
		
		// Remove spaces to count only characters
		String stringWithoutSpaces = str.replaceAll(" ", "");
		
		// Count the number of characters
		int numberOfCharacters = stringWithoutSpaces.length();
		
		System.out.println("Number of characters in the string: " + numberOfCharacters);
		
		String str2 = "this is an interview";
		
		// Split the string into an array of words using a space as the delimiter
		String[] words = str2.split(" ");
		
		// Count the number of words
		int numberOfWords = words.length;
		
		System.out.println("Number of words in the string: " + numberOfWords);
	}
	
}
