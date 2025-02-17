package core_java;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class Employee
{
	String name;
	int  age;
	Employee()
	{  //super();
		this(null,0);
		System.out.println("no arg");
		
	}
	
	Employee(String newName,int newAge)
	{
		name= newName;
		age=newAge;
		System.out.println("two arg");
	}
	
	public static void main(String[] args) {
		Employee emp= new Employee();
	}
}
