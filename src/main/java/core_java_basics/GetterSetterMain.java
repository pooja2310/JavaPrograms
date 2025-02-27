package core_java_basics;

public class GetterSetterMain
{
	public static void main(String[] args) {
		GetterSetter gs= new GetterSetter(2180232,  2242,  "Pooja");
		System.out.println(gs.getEmpId());
		System.out.println(gs.getCardNo());
		System.out.println(gs.getEmpName());
		System.out.println(gs.getOrgName());
		
		
		gs.FillTimesheet();
		gs.Login();
		
		GetterSetter gs2= new GetterSetter();
		gs2.setOrgName("TCS Mumbai");
		gs2.setCardNo(1111);
		System.out.println(gs2.getEmpId());
		System.out.println(gs2.getCardNo());
		System.out.println(gs2.getEmpName());
		System.out.println(gs.getOrgName());
		
		gs2.FillTimesheet();
		gs2.Login();
		
	}
}
