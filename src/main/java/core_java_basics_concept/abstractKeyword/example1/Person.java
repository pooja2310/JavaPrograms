package core_java_basics_concept.abstractKeyword.example1;

public abstract class Person {
	public abstract void talk();	// Abstract Method
	public abstract void run();		// Abstract Method
	public void walk () {			// Concrete Method
		System.out.println("Person: Walk invoked");
	}
}

class Employee extends Person {
	
	@Override
	public void talk() {
		System.out.println("Talk invoked");
	}
	
	@Override
	public void run() {
	}
	
	public void walk () {			// Concrete Method
		System.out.println("Employee: Walk invoked");
	}
	
	public static void main(String[] args) {
		// Person p = new Person(); // Invalid Object creation
		Employee e = new Employee();
		e.talk();
		e.walk();
		e.run();
	}
}
