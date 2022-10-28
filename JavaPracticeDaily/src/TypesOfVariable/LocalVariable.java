package TypesOfVariable;

public class LocalVariable {
//local variable
	private void add() {
		int a=100;
		System.out.println("A in add method----" +a);
	}
	public static void main(String[] args) {
		int a=200;
		LocalVariable c=new LocalVariable();
		c.add();
		System.out.println("A in main method---" +a);
	}
}
