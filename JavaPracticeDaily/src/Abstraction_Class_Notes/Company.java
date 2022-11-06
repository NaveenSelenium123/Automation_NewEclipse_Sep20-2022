package Abstraction_Class_Notes;

public class Company extends Employee{

	@Override
	public void empName() {
		System.out.println("Bala");
		
	}
	public static void main(String[] args) {
		Company c=new Company();
		c.empId();
		c.empName();
	}

}
