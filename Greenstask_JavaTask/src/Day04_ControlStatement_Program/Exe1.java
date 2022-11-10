package Day04_ControlStatement_Program;

import java.util.Scanner;

public class Exe1 {
	public static void main(String[] args) {
		
	
int age;
Scanner sc =new Scanner(System.in);
System.out.println("Get the age from the user");
 age= sc.nextInt();
 if(age>=18)
	 System.out.println("you are eleigibele for vote");
 else
	 System.out.println("you are not eleigibele for vote");
}
}