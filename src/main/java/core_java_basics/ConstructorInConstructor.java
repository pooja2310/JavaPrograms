package core_java_basics;

public class ConstructorInConstructor
{
	String name;
	int  age;
	ConstructorInConstructor()
	{
		this(null,0); // we are calling other constructor
		System.out.println("no arg");
		
	}
	
	ConstructorInConstructor(String newName, int newAge)
	{
		name= newName;
		age=newAge;
		System.out.println("two arg");
	}
	
	public static void main(String[] args) {
		
		ConstructorInConstructor emp= new ConstructorInConstructor();
	}
}
