package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class HashSet
{
	public static void main(String[] args)
	{
		//Linkedhashset
		ArrayList<Integer> num= new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,2,5,6,7,8,4,5,4,3));
		
		LinkedHashSet<Integer> dupnum= new LinkedHashSet<Integer>(num);
		ArrayList<Integer> numwithoutdup= new ArrayList<Integer>(dupnum);
		System.out.println(numwithoutdup);
		
		//Stream-java8
		ArrayList<Integer> numlist= new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,2,5,6,7,8,4,5,4,3));
		List<Integer> listwithoutdup = numlist.stream().distinct().collect(Collectors.toList());
		System.out.println(listwithoutdup);
		
		
	}
}
