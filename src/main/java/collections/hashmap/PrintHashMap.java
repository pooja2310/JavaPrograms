package collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintHashMap {
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
		
		
		System.out.println(hmap);
		
		System.out.println("----------------------------------------");
	
		//for each loop
		for (Map.Entry<String, String> entry : hmap.entrySet()) {
			System.out.println("Keys : " + entry.getKey() + " Values :" + entry.getValue());
		}
		
		System.out.println("--------------------------------");
		
		// java 8 for each lambda
		hmap.forEach((k,v)-> System.out.println("keys :" +k+ " Value :" +v ));
		
		System.out.println("--------------------------------");
		
		// Iterator
		Iterator<Map.Entry<String, String>> keyValue= hmap.entrySet().iterator();
		while(keyValue.hasNext())
		{
			Map.Entry<String ,String> entry= keyValue.next();
			System.out.println("Keys : " +entry.getKey() + " Values :" +entry.getValue());
		}
		
		
	}
}
