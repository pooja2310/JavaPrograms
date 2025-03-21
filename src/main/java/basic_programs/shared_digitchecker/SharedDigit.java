package basic_programs.shared_digitchecker;

public class SharedDigit {
	public static boolean hasSharedDigit(int number1, int number2) {
		if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
			while (number1 > 0) {
				int r1 = number1 % 10;
				while (number2 > 0) {
					int r2 = number2 % 10;
					number2 = number2 / 10;
					if (r1 == r2) {
						return true;
					}
				}
				number1 = number1 / 10;
			}
			return true;
		} else return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Is shared digit : " + hasSharedDigit(12, 14));
		System.out.println("Is shared digit : " + hasSharedDigit(12, 23));
		System.out.println("Is shared digit : " + hasSharedDigit(9, 99));
		System.out.println("Is shared digit : " + hasSharedDigit(15, 55));
		
		
	}
}
