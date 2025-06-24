package collections.hashmap;

import java.util.*;

public class LinkedHashmap {
	public static void main(String[] args) {
		Map<String ,Integer> map= new HashMap<>();
		map.put("BB",2);
		map.put("CC",1);
		map.put("AA",3);
		//Input : {BB=2, CC=1, AA=3}
		System.out.println(map);
		// Keys sorting
		List<String> keys = new ArrayList<>(map.keySet());
		System.out.println("WithoutSort :" + keys);
		Collections.sort(keys);
		System.out.println("WithSort :" + keys);
		
		//Values sorting
		List<Integer> values = new ArrayList<>(map.values());
		System.out.println("WithoutSort :" + values);
		Collections.sort(values);
		System.out.println("WithSort :" + values);
		
		Collections.rotate(values, -1);
		System.out.println("AfterRotate :" + values);
		
		Map<String,Integer> sortedMap= new LinkedHashMap<>();
		for(int i=0;i<map.size();i++)
		{
			sortedMap.put(keys.get(i),values.get(i));
		}
		System.out.println("FinalOutput:" + sortedMap);
		// FinalOutput:{AA=2, BB=3, CC=1}
		
		
	}
}

