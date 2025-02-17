package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayComparison
{
	
	
	public static void main(String[] args)
	{
		
		ArrayList<String> arr1= new ArrayList<String>(Arrays.asList("Java", "Ruby","python","C#","C++"));
		
		ArrayList<String> arr2= new ArrayList<String>(Arrays.asList("Java", "Ruby","python","C#","C"));
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		System.out.println(arr1.equals(arr2));
		
		//Compare list and find additional element
//		arr1.removeAll(arr2) ;
//		System.out.println(arr1);
//
		arr2.removeAll(arr1);
		System.out.println(arr2);
		
		//Find commmon element from the list
		
		ArrayList<String> arr3= new ArrayList<String>(Arrays.asList("A", "B","C","D","C++"));
		
		ArrayList<String> arr4= new ArrayList<String>(Arrays.asList("A", "B","C","C#","D"));
		
//		arr3.retainAll(arr4);
//		System.out.println(arr3);
		
		arr4.retainAll(arr3);
		System.out.println(arr4);
	}
	
}
