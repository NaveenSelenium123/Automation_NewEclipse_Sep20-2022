package MultilevelInheritance;

public class Client  extends  Company{

	public void cliName() {
		
System.out.println("Capjemeini");
	}
	public static void main(String[] args) {
		Client a =new Client();
		a.empId();
		a.empName();
		a.compId();
		a.compName();
		a.cliName();
	}
}
