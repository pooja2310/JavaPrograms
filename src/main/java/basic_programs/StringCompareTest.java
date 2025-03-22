package basic_programs;

public class StringCompareTest {
	public static void main(String[] args) {
		String st1 = "Ankit";
		String st2 = "Ankita";
		String st4 = new String("Ivaan");
		System.out.println(st1.compareTo(st2));
		System.out.println(st1.compareTo(st4));
		System.out.println(st2.compareTo(st4));
	}
}
