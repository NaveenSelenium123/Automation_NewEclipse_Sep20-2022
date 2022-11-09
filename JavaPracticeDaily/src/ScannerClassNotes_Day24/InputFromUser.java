package ScannerClassNotes_Day24;
import java.util.Scanner;
public class InputFromUser {
	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter the age");
byte age = sc.nextByte();

System.out.println("Enter the EmpId");
short EmpId = sc.nextShort();

System.out.println("Enter the roll no");
int roll = sc.nextInt();

System.out.println("Enter the phone no");
long phone = sc.nextLong();

System.out.println("Enter the salary");
float salary = sc.nextFloat();


System.out.println("Enter the previous salary");
double salary1 = sc.nextDouble();

System.out.println("Enter the martial status");
boolean martial = sc.nextBoolean();

System.out.println("Enter the company name");
String company = sc.next();

System.out.println(age);
System.out.println(EmpId);
System.out.println(roll);
System.out.println(phone);
System.out.println(salary);
System.out.println(salary1);
System.out.println(martial);
System.out.println(company);
}
}