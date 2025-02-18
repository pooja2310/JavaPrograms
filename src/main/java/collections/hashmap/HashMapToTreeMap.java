package collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapToTreeMap
{
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		hmap.put("Google", 1000);
		hmap.put("walmart", 2000);
		hmap.put("Amazon", 3400);
		hmap.put("Nykaa", 5555);
		
		System.out.println(hmap);
		System.out.println("Size :" + hmap.size());
		
		System.out.println("----------------------");
		
		
		for(Map.Entry<String, Integer> temp : hmap.entrySet())
		{
			System.out.println(temp.getKey() + " : "  + temp.getValue());
			//System.out.println(temp.getValue());
			
		}
		System.out.println("----------------------");
		Map<String,Integer>  treemap= new TreeMap<>(hmap);
		for(Map.Entry<String, Integer> temp1 : treemap.entrySet())
		{
			System.out.println(temp1.getKey() + " : "  + temp1.getValue());
			//System.out.println(temp1.getValue());
			
		}
	}
}
