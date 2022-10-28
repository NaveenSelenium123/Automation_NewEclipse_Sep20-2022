package TypesOfVariable;
// instance variable
public class Company {
public int a;
private void add() {
	a=200;
	System.out.println("A in add method---" +a);
}
public static void main(String[] args) {
	Company c=new Company();
	System.out.println("A before method calling--" +c.a);
	c.add();
	System.out.println("A after method calling---" +c.a);
	Company c1=new Company();
	System.out.println("After new obj creation---" +c1.a);
}
}
