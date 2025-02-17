package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronization
{
	public static void main(String[] args) {
		// Collections.synchronizedList -method for synchronization
		List<String> namelist= Collections.synchronizedList(new ArrayList<>());
		namelist.add("java");
		namelist.add("python");
		namelist.add("ruby");
		namelist.add("csharp");
		
		System.out.println(namelist);
		// to iterate /traverse we use synchronization
		synchronized (namelist)
		{
			Iterator<String> itr= namelist.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		// copyOnWriteArrayList class for synchronization
		
		CopyOnWriteArrayList<String> emplist= new CopyOnWriteArrayList<String>();
		emplist.add("c");
		emplist.add("c++");
		Iterator<String> itr= emplist.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
