package HierarchicalInheritance;

public class Client  extends Employee {

	public void cliName() {
		
System.out.println("Capjemeini");
	}
	public static void main(String[] args) {
		Client a =new Client();
		a.empId();
		a.empName();
		a.cliName();
	}
}
