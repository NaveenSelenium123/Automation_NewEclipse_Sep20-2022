package Day03_Polymorphism_Abstraction;

public class Exe2 {
public void empId( String name) {
	
System.out.println(name);
}

public void empId( int id) {
	
System.out.println(id);
}

public void empId(String city,int pincode) {
	
System.out.println(city+"\t"+pincode);
}
public static void main(String[] args) {
	Exe2 a=new Exe2();
	a.empId(2108282);
	a.empId("Anna univ");
	a.empId("chennai", 600039);
}
}
