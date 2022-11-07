package SingleInheritance;

public class Company extends Employee{
	public void compId() {
	System.out.println("749739");

}
	
	
	public void compName() {
		
System.out.println("TCS");
	}
	
	public static void main(String[] args) {
		Company v=new Company();
		v.empId();
		v.empName();
		v.compId();
		v.compName();
	}
}
