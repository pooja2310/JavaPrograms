package collections.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee1= new Employee(30,"Aniket");
		Employee employee2= new Employee(27,"Pooja");
		Employee employee3= new Employee(25,"Akshay");
		Employee employee4= new Employee(24,"Vinit");
		Employee employee5= new Employee(40,"Ramya");
		
		List<Employee> employeeList = new ArrayList<>(Arrays.asList(employee1,employee2,employee3,employee4,employee5));
		
		for(Employee employee:employeeList)
		{
			System.out.println("Before Sorting :" + employee);
		}
		EmployeeComparator employeeComparator = new EmployeeComparator();
		Collections.sort(employeeList,employeeComparator);
		
		System.out.println("------------------------------");
		for(Employee employee:employeeList)
		{
			System.out.println("After Sorting :" + employee);
		}
		
	}
}
