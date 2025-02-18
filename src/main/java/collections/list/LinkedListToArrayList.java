package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
	public static void main(String[] args) {
		List<String> linkedToArrayList = new LinkedList<>();
		System.out.println("Is Linked list empty : "  +linkedToArrayList.isEmpty());
		linkedToArrayList.add("Apple");
		linkedToArrayList.add("Mango");
		linkedToArrayList.add("Banana");
		linkedToArrayList.add("Pear");
		
		for(String list : linkedToArrayList)
		{
			System.out.println(list);
		}
		System.out.println("Is Linked list empty : " +linkedToArrayList.isEmpty());
		
		List<String> arrayList = new ArrayList<>(linkedToArrayList); //Linked list to arraylist
		
			System.out.println(arrayList);
		
	}
}
