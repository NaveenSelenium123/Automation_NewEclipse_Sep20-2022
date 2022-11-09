package Exception;

public class NullPointer {
public static void main(String[] args) {
	String s=null;
	System.out.println(System.identityHashCode(s));
	System.out.println("==================");
	System.out.println(s.charAt(10));
}
}
