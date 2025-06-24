package basic_programs;

public class StringFormatter {
	
	public static void main(String[] args) {
		String str = "Pooja kanavaje";
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse().toString();
			result.append(sb).append(" ");
		}
		
		// Trim the extra space at the end
		System.out.println("Output: " + result);
	
	
	
		String str1 = "I am Pooja";
		System.out.println("Input String : " + "\"I am Pooja\"");
		String spl[] = str1.split(" ");
		StringBuilder reverse = new StringBuilder();
		for (int i = spl.length - 1; i >= 0; i--) {
			reverse.append(spl[i]).append(" ");
		}
		System.out.println("Reverse String : " + reverse);
	}
}
