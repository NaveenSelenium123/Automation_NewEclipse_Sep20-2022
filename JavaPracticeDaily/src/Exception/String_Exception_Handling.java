package Exception;

public class String_Exception_Handling {

	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			String s="hi";
			System.out.println(s.charAt(10));
		}
		catch(ArithmeticException e) {
			System.out.println("Dont divide by zero");
		}
catch(Exception e) {
	System.out.println("Null value");
}
		finally {
			System.out.println("Success");
		}
		System.out.println(5);
		System.out.println(6);
	}

}
