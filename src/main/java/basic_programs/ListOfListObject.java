package basic_programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfListObject
{
	public static void main(String[] args)
	{
		// Create a list of lists
		List<List<Object>> listOfLists = new ArrayList<>();
		
		// Add the rows to the list of lists
		listOfLists.add(Arrays.asList(1, "BMW", "silver", 5000));
		listOfLists.add(Arrays.asList(2, "audi", "blue", 4000));
		listOfLists.add(Arrays.asList(3, "Mercedes", "white", 5000));
		listOfLists.add(Arrays.asList(4, "test", "green", 2000));
		listOfLists.add(Arrays.asList(5, "silver", "Bugatti", 4000));
		
		// Print the original list of lists
		System.out.println("Original List:");
		printList(listOfLists);
		
		// Remove the rows containing the value "silver"
		for (int i = 0; i < listOfLists.size(); i++)
		{
			List<Object> row = listOfLists.get(i);
			if (row.contains("silver"))
			{
				listOfLists.remove(i);
				i--; // Adjust the index after removal
			}
		}
		
		// Print the updated list of lists
		System.out.println("Updated List:");
		printList(listOfLists);
	}
	
	// Helper method to print the list of lists
	private static void printList(List<List<Object>> listOfLists)
	{
		for (List<Object> innerList : listOfLists)
		{
			for (Object element : innerList)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

