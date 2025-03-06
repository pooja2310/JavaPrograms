package basic_programs.playing_cat;

public class IsCatPlaying {
	public static boolean isCatPlaying(boolean summer, int temperature) {
		boolean result = false;
		if (summer) {
			if (temperature >= 25 && temperature <= 35)
				result = true;
			else result = false;
		}
		if (!summer) {
			if (temperature >= 25 && temperature <= 45)
				result = true;
			else result = false;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Is Cat Playing : "  + isCatPlaying(true, 10));
		System.out.println("Is Cat Playing : "  + isCatPlaying(true, 35));
		System.out.println("Is Cat Playing : "  + isCatPlaying(false, 46));
		System.out.println("Is Cat Playing : "  + isCatPlaying(false, 35));
		
	}
	
}
