package collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapIterator
{
	public static void main(String[] args)
	{
		HashMap<String, String> hmap= new HashMap<String, String>();
		hmap.put("Pooja","kanavaje");
		hmap.put("Aniket","bharsakale");
		hmap.put("Akshay","kanavaje");
		hmap.put("shravya","kumbhar");
		hmap.put(null,"john");
		hmap.put(null,"steve");
		hmap.put("jacob",null);
		hmap.put("shashi","peter");
		hmap.put("ravi",null);
		hmap.put("shashi","peter");
		hmap.get("Pooja");
		
		
		System.out.println("get1: " + hmap.get("Pooja"));
		System.out.println("get2: " + hmap.get("Pooja123"));
		
		
		
		System.out.println(hmap);
		
		System.out.println("----------------------------------------");
		
		
		//iterate the hmap using keyset
//		Iterator<String> it =hmap.keySet().iterator();
//		while(it.hasNext())
//		{
//			String key= it.next();
//			String value= hmap.get(key);
//			System.out.println("keys : "  +key+ "  values : "   +value);
//		}
//
		//iterate the hmap using entryset
		
		Iterator<Map.Entry<String, String>> keyValue= hmap.entrySet().iterator();
		//while loop
		while(keyValue.hasNext())
		{
			Map.Entry<String ,String> entry= keyValue.next();
			System.out.println("Keys : " +entry.getKey() + " Values :" +entry.getValue());
		}
		
		System.out.println("--------------------------------");
		//for each loop
		for (Map.Entry<String, String> entry : hmap.entrySet()) {
			System.out.println("Keys : " + entry.getKey() + " Values :" + entry.getValue());
		}
		
		System.out.println("--------------------------------");
		
		// java 8 for each lambda
		hmap.forEach((k,v)-> System.out.println("keys :" +k+ " Value :" +v ));
	}
}
