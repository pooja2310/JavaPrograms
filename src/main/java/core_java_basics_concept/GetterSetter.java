package core_java_basics_concept;

public class GetterSetter {

static String orgName="TCS Pune";
int empId;
int CardNo;
String EmpName;

public void FillTimesheet(){
	System.out.println(this.EmpName+  " has filled timesheet");
}

public void Login(){
	System.out.println(this.EmpName+  " has logged in");
}

public GetterSetter(int empId, int CardNo, String EmpName)
{
	super();
	this.empId= empId;
	this.CardNo= CardNo;
	this.EmpName= EmpName;
	
}

public GetterSetter(){
	super();
}
	
	public  String getOrgName() {
		return orgName;
	}
	
	public  void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getCardNo() {
		return CardNo;
	}
	
	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	
	public void setEmpName(String empName) {
		EmpName = empName;
	}
}

