package Day01_Class_Object_Method;
import Day01_Class_Object_Method.Exe6_Company;
import Day01_Class_Object_Method.Exe6_Client;
import Day01_Class_Object_Method.Exe6_Project;

public class Exe6_Employee {
private void empName() {
	System.out.println("Rajesh");
}
public static void main(String[] args) {
	Exe6_Employee n =new Exe6_Employee();
	n.empName();
	Exe6_Company m =new Exe6_Company();
	m.companyName();
	Exe6_Client o =new Exe6_Client();
	o.clientName();
	Exe6_Project p =new Exe6_Project();
	p.projectName();
	
}
}
