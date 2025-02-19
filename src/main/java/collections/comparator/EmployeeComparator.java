package collections.comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>
{
	// this logic to get data in descending order using comparator
	
	@Override
	public int compare(Employee emp1, Employee emp2)
	{
		if(emp1.getAge()> emp2.getAge())
			return -1;
		else if(emp1.getAge()< emp2.getAge())
			return 1;
		else return 0;
	}
}
