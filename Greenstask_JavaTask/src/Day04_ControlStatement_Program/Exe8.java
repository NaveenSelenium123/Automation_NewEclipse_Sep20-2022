package Day04_ControlStatement_Program;

public class Exe8 {
public static void main(String[] args) {
	int n=9;
	boolean prime=true;
	for (int i = 2; i < n; i++) {
	if(n%i == 0) {
		prime=false;
		break;
	}
	}
	System.out.println(prime);
}
}