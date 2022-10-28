package Own_Program_SelfNotes;

public class swapWithout {  //swap two variable without third variable
public static void main(String[] args) {
	String s1="Good";
	String s2="Morning";
	System.out.println("String before swapping------" +s1+ " "  +s2);
	s1=s1+s2;
	s2=s1.substring(0,(s1.length()-s2.length()));
	System.out.println(s2);
	s1=s1.substring(s2.length());
	System.out.println("String after swapping--------" +s1+ " " +s2);
	
}
}