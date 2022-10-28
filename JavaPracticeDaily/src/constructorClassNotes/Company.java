package constructorClassNotes;

public class Company {   // consructror chaining using "this" keyword

	public Company() {
	System.out.println("Default constructro");	
	}
	
public Company(int id) {
	this();
	System.out.println("Int para constructor"  +id);	
	}

public Company(String s) {
	this(100);
	System.out.println("String para constructor"  +s);	
}

public static void main(String[] args) {
	Company c=new Company("Java");	
}
}
