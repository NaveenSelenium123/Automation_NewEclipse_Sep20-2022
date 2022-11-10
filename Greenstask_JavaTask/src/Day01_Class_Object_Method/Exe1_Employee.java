package Day01_Class_Object_Method;
public class Exe1_Employee {
	public void empId() {
	System.out.println("My employee id 15529");
}
	public void empName() {
	System.out.println("My empName is Naveen");
}
	public void empDOB() {
System.out.println("Employee DOB is 09-12-1991");
}
	public void empPhone() {
	System.out.println("employee phone no is 8393829829");
}
	public void empEmail() {
	System.out.println("abc@gmail.com");
}
	public void empAddress() {
	System.out.println("Chenni-600084,omr,thoraipakkam");
}
	public static void main(String[] args) {
		Exe1_Employee v =new Exe1_Employee();
		v.empId();
		v.empName();
		v.empDOB();
		v.empPhone();
		v.empEmail();
		v.empAddress();
	}
}
