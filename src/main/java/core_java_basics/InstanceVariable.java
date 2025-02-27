package core_java_basics;

public class InstanceVariable
{
	static int  a= 10;
	
	public static void main(String[] args)
	{
	
	InstanceVariable iv= new InstanceVariable();
	
		
		System.out.println(InstanceVariable.a);
		variable1();
	}
	
	public  static void variable1()
	{
		System.out.println(a);
	}
}
