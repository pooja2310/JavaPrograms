package basic_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfList
{
	public static void main(String[] args) {
		// Create a list of lists
		List<List<Integer>> listOfLists = new ArrayList<>();
		
		// Add the rows to the list of lists
		listOfLists.add(Arrays.asList(1, 2, 3));
		listOfLists.add(Arrays.asList(4, 2, 6));
		listOfLists.add(Arrays.asList(7, 8, 9));
		
		// Print the original list of lists
		System.out.println("Original List:");
		printList(listOfLists);
		
		// Remove the rows containing the element 2
		for (int i = 0; i < listOfLists.size(); i++) {
			List<Integer> row = listOfLists.get(i);
			if (row.contains(2)) {
				listOfLists.remove(i);
				i--; // Adjust the index after removal
			}
		}
		
		// Print the updated list of lists
		System.out.println("Updated List:");
		printList(listOfLists);
	}
	
	// Helper method to print the list of lists
	private static void printList(List<List<Integer>> listOfLists)
	{
		for (List<Integer> innerList : listOfLists)
		{
			for (int element : innerList)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
