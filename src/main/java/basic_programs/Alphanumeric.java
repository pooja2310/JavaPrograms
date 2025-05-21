package basic_programs;

public class Alphanumeric {
	public static void main(String[] args) {
		String s= "Test123";
		String character= s.replaceAll("[^a-zA-Z]","");
		String numbers=s.replaceAll("[^0-9]","");
		 System.out.println(character);
		 System.out.println(numbers);
		 
	}
}
