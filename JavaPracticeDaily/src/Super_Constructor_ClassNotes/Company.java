package Super_Constructor_ClassNotes;
public class Company extends Employee{
	 public Company() {
		super(200);
		 System.out.println("Default constructro");		
	}
	 public Company(int id) {
		 this();
		 System.out.println("Int para constructor"  +id);	
		}
	 
	 public Company(String s) {
		 this(100);
		 System.out.println("String para constructor---"  +s);	
		}
	 
	public static void main(String[] args) {
		Company c=new Company("Java");
		
	} 
}
