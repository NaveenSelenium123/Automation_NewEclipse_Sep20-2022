package Day04_ControlStatement_Program;

public class Exe11 {
public static void main(String[] args) {
	int number =123,reverse=0;
	while(number!= 0) {
		int rem=number%10;
		reverse=reverse*10+rem;
		number=number/10;	
	}
	System.out.println("the reverse number is " +reverse);
}
}
