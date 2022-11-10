package Day06_String;
public class Exe15 {
public static void main(String[] args) {
	String s="Welcome To Java class @123";
	int upper=0,lower=0,number=0,specialchar=0,space=0;
	
	char ch;
	for (int i = 0; i < s.length(); i++) {
		ch= s.charAt(i);
		if(ch>='A' && ch<='Z') {
			upper++;
		}
		else if(ch>='a' && ch<='z') {
			lower++;
		}
		
		else if(ch>='0' && ch<='9') {
			number++;
		}
		
		else if(ch ==' ' ) {
			space++;
		}
		else {
			specialchar++;
		}
		
	}
	System.out.println("the total no of upper letter" +upper);
	System.out.println("the total no of small letter" +lower);
	System.out.println("the total no of numbers" +number);
	System.out.println("the total no of special char" +specialchar);
	System.out.println("the total no of spaces" +space);
}
}
