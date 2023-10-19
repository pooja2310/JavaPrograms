package basic_programs;

public class VowelCount
{
		public static void main(String[] args)
		{
			String inputString = "INTERVIEW";
			int vowelCount = countVowels(inputString);
			
			System.out.println("The number of vowels in the string \"" + inputString + "\" is: " + vowelCount);
		}
		
		public static int countVowels(String input)
		{
			int count = 0;
			
			// Convert the input string to lowercase to make it case-insensitive
			input = input.toLowerCase();
			
			for (int i = 0; i < input.length(); i++)
			{
				char currentChar = input.charAt(i);
				
				// Check if the current character is a vowel (a, e, i, o, u)
				if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
						currentChar == 'o' || currentChar == 'u')
				{
					count++;
				}
			}
			
			return count;
		}
}

