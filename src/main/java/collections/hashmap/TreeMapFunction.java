package collections.hashmap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapFunction
{
	public static void main(String[] args) {
		TreeMap<Integer, String> tm= new TreeMap<>();
		tm.put(100,"Pooja");
		tm.put(500,"Aniket");
		tm.put(100000, "Peter");
		tm.put(40000,"John");
		
		System.out.println(tm);
		
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		
		Set<Integer> lessthan = tm.headMap(500).keySet();  //less than this key
		System.out.println(lessthan);
		Set<Integer> greaterthan =	tm.tailMap(40000).keySet();  //greater thsn this key
		System.out.println(greaterthan);
		
		
		
	}
}
