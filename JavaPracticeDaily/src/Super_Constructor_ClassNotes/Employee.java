package Super_Constructor_ClassNotes;
public class Employee {
	public Employee() {
		System.out.println("Parent Default constructro");	
	}
	
	
public Employee(int i) {
	this("Selenium");       // activating this class String default
	 System.out.println(" Parent Int para constructor"  +i);		
	}


public Employee(String n) {
	this();             // activating this class default
	System.out.println(" Parent String para constructor---"  +n);		
}
}
