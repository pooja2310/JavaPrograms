package collections.hashmap;

import java.util.*;

public class HashmapToArray
{
	public static void main(String[] args) {
		
		Map<String, Integer> hmap = new HashMap<>();
		hmap.put("Google", 1000);
		hmap.put("walmart", 2000);
		hmap.put("Amazon", 3400);
		hmap.put("Nykaa", 5555);
		
		System.out.println(hmap);
		System.out.println("Size :" + hmap.size());
		
		
		
		List<String> keyList = new ArrayList<>(hmap.keySet()); // Keys
		List<Integer> valueList = new ArrayList<>(hmap.values()); // Values
		
//		for (String key : hmap.keySet()) {
//			Integer value = hmap.get(key);
//			System.out.println("keys : " + key + "  values : " + value);
//		}
		
		for (Map.Entry<String, Integer> temp : hmap.entrySet())
		{
			keyList.add(temp.getKey());
			valueList.add(temp.getValue());
		}
//		System.out.println("KeyList :" + keyList);
//		System.out.println("valueList :" + valueList);
		
		for (String key : keyList) {
			
			System.out.println("KeyList :" + key);
		//	System.out.println("valueList :" + valueList);
		}
		for (Integer value : valueList) {
			
			//System.out.println("KeyList :" + key);
				System.out.println("valueList :" + value);
		}
		
		
	}
}
