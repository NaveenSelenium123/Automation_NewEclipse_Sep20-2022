package Day04_ControlStatement_Program;

public class Exe7 {
public static void main(String[] args) {
	int n,a =0,b = 0,c = 1;
	System.out.println("Fibonacci series:");
	for (int i = 0; i <=100; i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.println(a+ " ");
	}
}
}
