package basic_programs.switchcase_example;

public class PrintNumberInWord {
	public static String printNumberInWord(int number) {
		return switch (number) {
			case 0 -> "ZERO";
			case 1 -> "ONE";
			case 2 -> "TWO";
			case 3 -> "THREE";
			case 4 -> "FOUR";
			case 5 -> "FIVE";
			case 6 -> "SIX";
			case 7 -> "SEVEN";
			case 8 -> "EIGHT";
			case 9 -> "NINE";
			default -> {
				System.out.println("OTHER");
				yield null;
			}
		};
	}
	
	public static void main(String[] args) {
		System.out.println("Number in words is : " + printNumberInWord(8));
		System.out.println("Number in words is : " + printNumberInWord(9));
		System.out.println("Number in words is : " + printNumberInWord(10));
		System.out.println("Number in words is : " + printNumberInWord(-5));
		
	}
}
