package Own_Program_SelfNotes;
import java.util.Scanner;
public class ReplaceAllVowels {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
//	System.out.println("Enter the String");
//	String s = in.nextLine();
//	String replaceAll = s.replaceAll("[AEIOUaeiou]","");
//	System.out.println(replaceAll);	

		String s1="javatpoint is a very good website";  
		String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);  
		
}
}
