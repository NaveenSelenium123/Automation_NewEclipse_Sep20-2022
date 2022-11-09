package Singleton;

public class EmployeeTwo {
static EmployeeTwo e;
private EmployeeTwo() {
	
}

public static  EmployeeTwo getObject() {

System.out.println(e);
if(e == null) {
	e=new EmployeeTwo();
}
System.out.println(e);
return e;
}

public void add() {
	System.out.println("Method called");

}
public static void main(String[] args) {
	EmployeeTwo object = getObject();
	object.add();
	 EmployeeTwo object1 = getObject();
	 EmployeeTwo object2 = getObject();
	 EmployeeTwo object3 = getObject();
	 EmployeeTwo object4 = getObject();
}
}
