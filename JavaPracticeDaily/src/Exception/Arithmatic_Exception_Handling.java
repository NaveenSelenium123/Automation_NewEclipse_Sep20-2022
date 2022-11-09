package Exception;

public class Arithmatic_Exception_Handling {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
		System.out.println(4/0);
		}
		catch(ArithmeticException e) {
		System.out.println("Dont divide by zero");	
		}
		finally {
			System.out.println("Success");
		}
		System.out.println(5);
		System.out.println(6);	
	}
}
