package basic_programs;

public class RemoveOccurrenceChar {
	public static void main(String[] args) {
		String str = "abcdAaaBa";
		char ch = 'a';
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch)
				result = result + str.charAt(i);
		}
		System.out.println("Final Result :" + result);
	}
}
