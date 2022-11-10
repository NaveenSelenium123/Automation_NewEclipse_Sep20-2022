package Day06_String;

public class Exe8 {
public static void main(String[] args) {
	String s="NISHANTHI";
	System.out.println(s.toLowerCase());
	
	String s1="nishanthi";
	System.out.println(s1.toLowerCase());
	
	String s2="WelcomE";
System.out.println(s2.substring(0,1).toLowerCase()+s2.substring(1, 6).toUpperCase()+s2.substring(6).toLowerCase());	
	
	String s3="WelComeToJava";
	int upper=0,lower=0;
	for(int i=0;i<s3.length();i++) {
		char ch= s3.charAt(i);
		if(ch>='A' && ch<='Z') {
			upper++;
		}
		else if(ch>='a' && ch<='z') {
			lower++;
		}
	}
	System.out.println("Uppercount:" +upper);
	System.out.println("Lowercount:" +lower);
}
}
