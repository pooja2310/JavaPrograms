package basic_programs.switchcase_example;

public class PrintWeekday {
	public static String printWeekday(int day) {
		
		return switch (day) {
			case 1, 5, 2, 3, 4 -> "Weekday";
			case 6, 7 -> "Weekend";
			default -> {
				System.out.println("OTHER");
				yield null;
			}
		};
	}
	
	public static void main(String[] args) {
		System.out.println("Is weekday or Weekend : " + printWeekday(2));
		System.out.println("Is weekday or Weekend : " + printWeekday(8));
		System.out.println("Is weekday or Weekend : " + printWeekday(-2));
		System.out.println("Is weekday or Weekend : " + printWeekday(6));
	}
}
