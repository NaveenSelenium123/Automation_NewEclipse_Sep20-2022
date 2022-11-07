package Day01_Day02_JavaClassNotes;

public class Company {
	public void comID() {
	
System.out.println("Company ID is 8767");
}
	public void comName() {
	
		System.out.println("Company ID is HCL ");
}
	
	public static void main(String[] args) {
		Company c=new Company();
		c.comID();
		c.comName();
		
		
		Employee e =new Employee();
		e.empId();
		e.empName();
	}
}
