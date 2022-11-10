package Day04_ControlStatement_Program;

public class Exe3 {
public static void main(String[] args) {
	int n=100;
	System.out.println("List of even numbers 1 to "+n+": ");
	for(int i=0;i<=n;i++) {
		if(i%2 ==0) {
			System.out.println(i + " ");
		}
	}
}
}
