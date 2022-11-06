package polymorphism;

public class Company1 extends Employee1{
 @Override
public void empId() {
	System.out.println("77777");
}
 public static void main(String[] args) {
	 Company1 a =new Company1();
	 a.empId();
	 a.empName();
}
}
