package core_java_basics_concept.abstract_class;

/**
 * An Abstract class can "either" contain zero or more than 1 Abstract methods (method signatures)
 * An Abstract class can "either" contain zero or more than 1 Concrete methods
 * An Abstract class will always have partial-ness or incompleteness
 * This can only be dissolved by extending an abstract class & providing implementations to all the abstract methods
 * Partial methods means - Methods without Body i.e simply having Method signatures
 *
 * Interface/Abstract classes only tell us WHAT IS TO BE DONE?
 * Implementation classes tell us HOW THOSE THINGS ARE TO BE DONE EXACTLY!
 */
public abstract class MyAbstract {
	
	// ABSTRACT METHOD
	public abstract void display();
	
	// CONCRETE METHOD
	public void print () {
		System.out.println("The Method of MyAbstract abstract class");
	}
	
	public void sing () {
		System.out.println("la la la la");
	}
	
}
