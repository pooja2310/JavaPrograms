package collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashmapComparison
{
	public static void main(String[] args) {
		Map<Integer,String> hmap= new HashMap<>();
		hmap.put(1,"BMW");
		hmap.put(2,"Audi");
		hmap.put(3,"Mercedeez");
		hmap.put(4,"skoda");
		
		Map<Integer,String> hmap1= new HashMap<>();
		hmap1.put(1,"BMW");
		hmap1.put(2,"Audi");
		hmap1.put(3,"Mercedeez");
		hmap1.put(4,"skoda");
		
		Map<Integer,String> hmap2= new HashMap<>();
		hmap2.put(1,"BMW");
		hmap2.put(2,"Audi");
		hmap2.put(3,"Mercedeez");
		
		//key and value comparison
		System.out.println(hmap.equals(hmap1));
		System.out.println(hmap.keySet().equals(hmap1.keySet()));
		
		HashSet<Integer> combinekeys= new HashSet<>(hmap.keySet());
		combinekeys.addAll(hmap2.keySet());
		System.out.println(combinekeys);
		combinekeys.removeAll(hmap2.keySet());
		System.out.println(combinekeys);
		
		
		
		Map<Integer,String> hmap3= new HashMap<>();
		hmap3.put(1,"BMW");
		hmap3.put(2,"Audi");
		hmap3.put(3,"Mercedeez");
		hmap3.put(4,"Mercedeez");
		
		System.out.println(new ArrayList<>(hmap2.values()).equals(new ArrayList<>(hmap3.values())));
		
		System.out.println(new ArrayList<>(hmap.values()).equals(new ArrayList<>(hmap1.values())));
		
		
		
		System.out.println(new HashSet<>(hmap2.values()).equals(new HashSet<>(hmap3.values())));
		
		System.out.println(new HashSet<>(hmap.values()).equals(new HashSet<>(hmap1.values())));
		
	}
}


