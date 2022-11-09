package AccessSpecifier_Day17;

public class Company extends Employee{
public static void main(String[] args) {
	Employee e =new Employee();
	e.empId();
	e.empName();
	
	Company c= new Company();
	c.empId();
	c.empName();
}
}
