package Day2_Inheritance_Scanner_Datatype_Accessspecifier;

import java.util.Scanner;

public class Exe2 {
public static void main(String[] args) {
	Scanner  c=new Scanner(System.in);
	System.out.println("student id is");
	String next = c.next();
	
	System.out.println("Mark1 is");
	int m1 = c.nextInt();
	
	System.out.println("Mark2 is");
	int m2 = c.nextInt();
	
	
	System.out.println("Mark3 is");
	int m3 = c.nextInt();
	
	
	System.out.println("Mark4 is");
	int m4= c.nextInt();
	
	System.out.println("Mark5 is");
	int m5 = c.nextInt();
	
	// total;
	float avg;
	int total=m1+m2+m3+m4+m5;
	avg=(float)(total/5);
	
	System.out.println("The total is" +total);
	System.out.println("the Avg is" +avg);
	
}
}
