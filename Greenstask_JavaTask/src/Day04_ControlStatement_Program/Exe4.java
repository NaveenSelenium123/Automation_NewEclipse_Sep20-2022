package Day04_ControlStatement_Program;

public class Exe4 {
public static void main(String[] args) {
	int sum=0;
	for(int i=0;i<=100;i++) {
		if(i%2 != 0) {
		sum=sum+i;	
		}
	}
	System.out.println("The sum of odd numbers 100 are" + sum);
}
}
