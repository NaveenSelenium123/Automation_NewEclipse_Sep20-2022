package TypesOfVariable;

public class Company1 {
// static variable
	public static int a=300;
	private void add() {
	a=200;
	System.out.println("A in add method" +a);
	}
	public static void main(String[] args) {
		System.out.println("A before object creation " +a);
		Company1 c=new Company1();
		System.out.println("A before method calling " +a);
		c.add();
		System.out.println("A after method calling " +a);
		Company1 c1=new Company1();
		System.out.println("After new Object creation" +a);
		Company1 c2=new Company1();
		System.out.println("After new Object creation" +a);
	}
}
