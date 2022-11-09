package MultiCatchException;

public class MultipleTry {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try {
		System.out.println(4/0);
	
	try {
		String s =null;
		System.out.println(s.charAt(10));
	}
	catch(NumberFormatException e){
	System.out.println("Number format exception handled");	
	}finally {
		System.out.println("Inner finally");
	}
}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Exception Handled");
	}
	finally {
		System.out.println("Outer finally");
	}
	
	
	System.out.println(5);
	System.out.println(6);
	System.out.println(7);
}
}
