package HierarchicalInheritance;

public class Company extends Employee{
	public void compId() {
	System.out.println("749739");

}
	public void compName() {
		
System.out.println("TCS");
	}
	
	public static void main(String[] args) {
		Company c=new Company();
		c.empId();
		c.empName();
		c.compId();
		c.compName();
	}
}
