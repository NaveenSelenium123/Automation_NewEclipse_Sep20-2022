package MultiCatchException;

public class Sample {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try {
		System.out.println(4/0);
		String s=null;
		System.out.println(s.charAt(10));
	}
	catch(NumberFormatException e){
		System.out.println("Number format exception handled");
	}
	catch(StringIndexOutOfBoundsException e){
		System.out.println("Number format exception handled");
	}
	
	catch(NullPointerException  e){
		System.out.println("NullPointerException handled");
	}
	
	catch(ArrayIndexOutOfBoundsException   e){
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	catch(Exception e){
		System.out.println(" exception handled in super class");
	}
	finally {
		System.out.println("Finally block handled");
	}
	
	System.out.println(5);
	System.out.println(6);
	System.out.println(7);
	
}
}
