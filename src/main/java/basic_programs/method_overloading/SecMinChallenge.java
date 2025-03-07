package basic_programs.method_overloading;

public class SecMinChallenge {
	public static String getDurationString(int seconds) {
		if (seconds >= 0) {
			System.out.println("Valid input");
		}
		return "";
		
	}
	
	public static String getDurationString(int minutes, int seconds) {
		String result = null;
		if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
			minutes = seconds / 60;
			int SecondRemainder = seconds % 60;
			int hour = minutes / 60;
			
			int MinutesRemainder = minutes % 60;
			System.out.println(+hour + "h " + MinutesRemainder + "m " + SecondRemainder + "s ");
		}
		return result;
	}
	
	public static void main(String[] args) {
		getDurationString(50000);
		
	}
}
