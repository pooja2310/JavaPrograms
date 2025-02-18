package collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetFunction {
	public static void main(String[] args){
		
		Set<String> hs= new HashSet<String>();
		hs.add("Pooja");
		hs.add("Aniket");
		hs.add("Shravi");
		
		System.out.println(hs);
		System.out.println(hs.contains("Pooja"));
		
		Iterator<String> it =hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Set<Integer> hs2= new HashSet<>();
		hs2.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
		
		Set<Integer> hs3= new HashSet<>();
		hs3.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10}));
		
//		hs2.addAll(hs3);
//		System.out.println(hs2);
		
		hs2.retainAll(hs3);
		
		System.out.println(hs2);
		
		
	}
}
