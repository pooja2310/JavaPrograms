package collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods
{
	public static void main(String[] args)
	{
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Java");
		ar.add("python");
		ar.add("ruby");
		ar.add("c");
		
		System.out.println("size"  +ar.size());
		
		ar.get(1);
		System.out.println(ar.contains("Java"));
		
		ArrayList<String> ar1= new ArrayList<String>(Arrays.asList("Pooja","Akshay","Aparna"));
		System.out.println(ar1);
		
		int i= ar1.lastIndexOf("Akshay");
		System.out.println(i);
		
//		ar1.remove(2);
//		System.out.println(ar1);
		
		ArrayList<String> ar2= (ArrayList<String>)ar1.clone();
		System.out.println(ar2);
		
		ArrayList<Integer> num= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		num.removeIf(number -> number%2!=0);
		System.out.println(num);
	}
}
