package basic_programs;

public class Alphanumeric_SumDigit {
	public static void main(String[] args) {
		String s = "pooja kanavaje987";
		String withoutSpace = s.replaceAll(" ", "");
		String character = withoutSpace.replaceAll("[^a-zA-Z]", "");
		String numbers = withoutSpace.replaceAll("[^0-9]", "");
		System.out.println("Character from string : " + character);
		System.out.println("Number from string :" + numbers);
		int number = Integer.parseInt(numbers);
		int sum = 0;
		int remainder = 0;
		while (number > 0) {
			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}
		System.out.println(sum);
	}
}
