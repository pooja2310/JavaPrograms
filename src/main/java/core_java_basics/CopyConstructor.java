package core_java_basics;

import lombok.Data;

@Data
public class CopyConstructor {
	
	private String name;
	private int age;
	// Parameterized constructor
	public CopyConstructor(String name, int age) {
		System.out.println("Parameterized constructor called");
		this.name = name;
		this.age = age;
	}
	// copy constructor
	public CopyConstructor(CopyConstructor cpc)
	{
		System.out.println("Copy constructor called");
		name= cpc.name;
		age= cpc.age;
	}
	public String toString()
	{
		
		return ("Name : " +name + " Age : " +age);
	}
	
}
