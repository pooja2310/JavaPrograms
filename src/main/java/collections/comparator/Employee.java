package collections.comparator;

import lombok.Data;

import java.util.Comparator;

@Data
public class Employee
{
	private int age;
	private String name;
	
	public Employee(int age, String name)
	{
		this.age= age;
		this.name=name;
		
		
	}
	

}
