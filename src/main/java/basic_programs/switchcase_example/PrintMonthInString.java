package basic_programs.switchcase_example;

public class PrintMonthInString {
	public static String printMonthInString(int month) {
		return switch (month) {
			case 1 -> "January";
			case 2 -> "February";
			case 3 -> "March";
			case 4 -> "April";
			case 5 -> "May";
			case 6 -> "June";
			case 7 -> "July";
			case 8 -> "August";
			case 9 -> "September";
			case 10 -> "October";
			case 11 -> "November";
			case 12 -> "December";
			default -> {
				System.out.println("OTHER");
				yield null;
			}
		};
	}
	
	public static void main(String[] args) {
		System.out.println("Month In String :" + printMonthInString(10));
		System.out.println("Month In String :" + printMonthInString(12));
		System.out.println("Month In String :" + printMonthInString(0));
		System.out.println("Month In String :" + printMonthInString(-8));
	}
}