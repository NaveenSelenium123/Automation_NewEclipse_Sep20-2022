package Day06_String;
public class Exe11 {
public static void main(String[] args) {
	System.out.println(" literal string");
	String s1="Nisha";
	System.out.println(System.identityHashCode(s1));
	String s2="nisha";
	System.out.println(System.identityHashCode(s2));
	
	System.out.println("===============================");
	System.out.println("Non literal string");
	String s3=new String("Nisha");
	System.out.println(System.identityHashCode(s3));
	String s4=new String("Nisha");
	System.out.println(System.identityHashCode(s4));
	
	
	System.out.println("===============================");
	System.out.println("Non literal string");
	String s5=new String("Nisha");
	System.out.println(System.identityHashCode(s5));
	String s6=new String("Rengan");
	System.out.println(System.identityHashCode(s6));
	String s7=new String("NishaRengan");
	System.out.println(System.identityHashCode(s7));
	
	System.out.println("===============================");
	System.out.println("literal string");
	String s8=("Nisha");
	System.out.println(System.identityHashCode(s8));
	String s9=("Rengan");
	System.out.println(System.identityHashCode(s9));
	String s10=("NishaRengan");
	System.out.println(System.identityHashCode(s10));
	
}
}
