package basic_programs;

public class PrintNum {
	public static void main(String[] args) {
		printNum(1);
	}
	
	// print number recursively without loop
	public static void printNum(int n) {
		if (n > 10)
			return;
		System.out.println(n);
		printNum(n + 1);
	}
}