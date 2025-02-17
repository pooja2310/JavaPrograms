package core_java;

import java.util.ArrayList;
import java.util.List;

public class Break {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
			
		}
		for (Integer j : numbers) {
			System.out.println(j);
			if (j == 7) {
				break;
			}
			
		}
		
		
	}
}
