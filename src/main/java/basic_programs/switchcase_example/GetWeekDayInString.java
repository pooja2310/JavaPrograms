package basic_programs.switchcase_example;

public class GetWeekDayInString {
	public static int getWeekDayInString(String day) {
		int result;
		switch (day) {
			case "sunday":
				result = 1;
				break;
			case "Monday":
				result = 2;
				break;
			case "Tuesday":
				result = 3;
				break;
			case "Wednesday":
				result = 4;
				break;
			case "Thursday":
				result = 5;
				break;
			case "Friday":
				result = 6;
				break;
			case "Saturday":
				result = 7;
				break;
			default:
				System.out.println("Invalid data");
				result = -1;
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("WeekDays in number : " + getWeekDayInString("Tuesday"));
		System.out.println("WeekDays in number : " + getWeekDayInString("January"));
		
	}
}
