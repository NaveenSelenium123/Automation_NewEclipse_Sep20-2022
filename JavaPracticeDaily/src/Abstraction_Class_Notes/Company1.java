package Abstraction_Class_Notes;

public class Company1 implements Employee1{

	@Override
	public void empId() {
	System.out.println("12345");
		
	}

	@Override
	public void empName() {
		System.out.println("Naveen");	
		
	}

	@Override
	public void empMobile() {
		System.out.println("123458382782");	
		
	}
public static void main(String[] args) {
	Company1 a =new Company1();
	a.empId();
	a.empMobile();
	a.empName();
}
}
