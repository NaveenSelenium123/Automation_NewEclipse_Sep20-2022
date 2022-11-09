package Singleton;
import Singleton.EmployeeTwo;
public class Company {

	public static void main(String[] args) {
		EmployeeTwo object = EmployeeTwo.getObject();
		 EmployeeTwo object1 = EmployeeTwo.getObject();
		 EmployeeTwo object2 = EmployeeTwo.getObject();
		 EmployeeTwo object3 = EmployeeTwo.getObject();
		 EmployeeTwo object4 = EmployeeTwo.getObject();
		 System.out.println(object);
		 System.out.println(object1);
		 System.out.println(object2);
		 System.out.println(object3);
		 System.out.println(object4);

	}

}
