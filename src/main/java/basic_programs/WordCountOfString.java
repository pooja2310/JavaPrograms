package basic_programs;

public class WordCountOfString
{
	
		public static int countWords(String sentence)
		{
			String[] words = sentence.split("\\s+");
			return words.length;
		}
		
		public static void main(String[] args) {
			String[] sentences = {
					"alice and bob love leetcode",
					"i think so too",
					"this is great thanks very much"
			};
			
			System.out.println("Word counts:");
			for (String sentence : sentences) {
				int count = countWords(sentence);
				System.out.println("\"" + sentence + "\": " + count);
			}
		}
}


