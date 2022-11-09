package Exception;

public class AgeIs {
public static void main(String[] args) {
	int age=10;
	int after5=age+5;
	if(after5<18) {
		throw new ArithmeticException("Age is not applicable");
	}
}
}
