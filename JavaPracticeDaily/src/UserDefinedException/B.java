package UserDefinedException;
import UserDefinedException.AException;
public class B {
public static void main(String[] args) {
	String id="HL0001";
	if(id.startsWith("hcl")) {
		System.out.println("Valid employee");
	}else
		try {
			throw new AException();
			
		}catch( AException e) {
			e.printStackTrace();
			System.out.println("Handling my own exception");
		}
	System.out.println(5);
	System.out.println(6);
}
}
