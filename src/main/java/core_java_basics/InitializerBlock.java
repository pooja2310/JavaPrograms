package core_java_basics;

public class InitializerBlock {
	static   //Static block
	{
		System.out.println("This is static block which is called first before main method");
	}
	
	static {
		System.out.println("This is initializer block");
	}
	
	InitializerBlock()   // Constructor
	{
		System.out.println("This is constructor block");
	}
	
	public static void main(String[] args) {
		//StaticBlock sb = new StaticBlock();
		System.out.println("This is main method");
	}
}
