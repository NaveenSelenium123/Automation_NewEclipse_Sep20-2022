package Day04_ControlStatement_Program;

import java.util.Scanner;

public class Exe13 {
public static void main(String[] args) {
	int number,digit,sum=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number is:");
	number= sc.nextInt();
	while(number>0) {
		digit=number%10;
		sum=sum+digit;
		number =number/10;
	}
	System.out.println("Sum of digits " +sum);
}
}
