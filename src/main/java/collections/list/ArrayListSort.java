package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
	public static void main(String[] args) {
		{
			List<Integer> arraySort = new ArrayList<>();
			arraySort.add(10);
			arraySort.add(24);
			arraySort.add(7);
			arraySort.add(67);
			
			System.out.println("Before sort :" + arraySort);
			
			Collections.sort(arraySort, Collections.reverseOrder());  //descending order
			System.out.println("After sort :" + arraySort);
			System.out.println("---------------------");
			List<String> arrayStringSort = new ArrayList<>();
			arrayStringSort.add("HP");
			arrayStringSort.add("DELL");
			arrayStringSort.add("Lenovo");
			arrayStringSort.add("Macbook");
			
			System.out.println("Before sort :" + arrayStringSort);
			arrayStringSort.add(2, "Asus");
			
			Collections.sort(arrayStringSort);    //descending order
			Collections.reverse(arrayStringSort);
			System.out.println("After sort :" + arrayStringSort);
			arrayStringSort.remove(1);
			System.out.println("After removal :" + arrayStringSort);
		}
	}
}
