package collections.list;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListToLinkedHashset
{
	public static void main(String[] args)
	{
		//Linkedhashset
		List<Integer> num= new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,2,5,6,7,8,4,5,4,3));
		
		Set<Integer> dupnum= new LinkedHashSet<Integer>(num);
		List<Integer> numwithoutdup= new ArrayList<Integer>(dupnum);
		System.out.println("Number without duplicate :   "  +numwithoutdup);
		
		//Stream-java8
		List<Integer> numlist= new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,2,5,6,7,8,4,5,4,3));
		List<Integer> listwithoutdup = numlist.stream().distinct().collect(Collectors.toList());
		System.out.println("Number without duplicate using stream :   "  +listwithoutdup);
		
		
	}
}
