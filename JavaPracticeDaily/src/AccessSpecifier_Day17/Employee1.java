package AccessSpecifier_Day17;

public class Employee1 {
static int a = 10;
public static void empName() {
	
System.out.println("Static");
}
public static void main(String[] args) {
	empName();
	System.out.println(a);
}
}
