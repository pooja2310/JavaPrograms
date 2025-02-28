package core_java_basics_concept.superkeyword;

public class SalaryVariableMain extends SalaryParent {
	int salary = 80000;
	
	public void display() {
		System.out.println("Salary :" + super.salary);
	}
	
	public static void main(String[] args) {
		SalaryVariableMain c = new SalaryVariableMain();
		c.display();
	}
}

