package collections.hashmap;

import java.util.*;

public class SynchronizedHashMap {
	
	
	public static void main(String[] args) {
		// Collections.synchronizedList -method for synchronization
		Map<String, Integer> nameList = Collections.synchronizedMap(new HashMap<>());
		nameList.put("java", 23);
		nameList.put("python", 45);
		nameList.put("ruby", 24);
		nameList.put("csharp", 67);
		
		
		System.out.println(nameList);
//		Set set = nameList.entrySet();
//		synchronized(nameList) {
//			Iterator i = set.iterator();
//		}
		// to iterate /traverse we use synchronization
		synchronized (nameList)
		{
			Iterator<Map.Entry<String, Integer>> keyValue= nameList.entrySet().iterator();
			while(keyValue.hasNext())
			{
				Map.Entry<String ,Integer> entry= keyValue.next();
				System.out.println("Keys : " +entry.getKey() + " Values :" +entry.getValue());
			}
			
		}
		
	}
}
