package collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList();
		
		// Given initialized array
		String[] strArray = {"Cocacola", "Pepsi", "Fanta", "Dr Pepper"};
		
		//Converting Array to ArrayList manually
		for (int i=0; i < strArray.length ; i++) {
			// Adding every element of array to the ArrayList
			al.add(strArray[i]);
		}
		
		// Showing arraylist elements using for-each loop
		for(String str1 : al) {
			System.out.println(str1);
		}
		//-------------------------------------------------------------------------------
		System.out.println("--------------");
		String[] cities={"Boston", "Dallas", "New York", "Chicago"};
		
		//Converting Array to ArrayList using Arrays.asList()
		ArrayList<String> list= new ArrayList<>(Arrays.asList(cities));
		
		// Add more elements to the converted list
		list.add("San Francisco");
		list.add("San jose");
		
		// Print arraylist elements using for-each loop
		for(String s : list) {
			System.out.println(s);
		}
    }
	
	
}