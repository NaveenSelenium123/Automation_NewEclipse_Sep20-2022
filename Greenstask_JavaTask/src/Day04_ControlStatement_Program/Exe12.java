package Day04_ControlStatement_Program;

public class Exe12 {
public static void main(String[] args) {
	int count=0,num=123;
	while(num != 0) {
		num=num/10;
		count++;
	}
	System.out.println("The number of digits" +count);
}
}
