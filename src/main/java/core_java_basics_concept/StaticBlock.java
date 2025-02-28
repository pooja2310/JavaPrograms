package core_java_basics_concept;

public class StaticBlock {
	static   //Static block is always called even if object is not created.
	{
		System.out.println("This is static block which is called first before main method");
	}
	
	StaticBlock()   // Constructor
	{
		System.out.println("This is constructor block");
	}
	
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		System.out.println("This is main method");
	}
}
