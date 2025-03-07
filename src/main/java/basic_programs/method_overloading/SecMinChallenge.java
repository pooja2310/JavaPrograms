package basic_programs.method_overloading;

public class SecMinChallenge {
	public static String getDurationString(int seconds) { // HARD-FACT
		String result = "";
		if (seconds >= 0) {        // HARD-FACT
			int minutes = seconds / 60;
			int secondRemainder = seconds % 60;
			result = getDurationString(minutes, secondRemainder);        // HARD-FACT
		}
		return result;
		
	}
	
	public static String getDurationString(int minutes, int seconds) {// HARD-FACT
		String result = null;
		if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) { // HARD-FACT
			int hour = minutes / 60;
			int minutesRemainder = minutes % 60;
			result = hour + "h " + minutesRemainder + "m " + seconds + "s";
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getDurationString(50000));
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(833, 20));
	}
}
