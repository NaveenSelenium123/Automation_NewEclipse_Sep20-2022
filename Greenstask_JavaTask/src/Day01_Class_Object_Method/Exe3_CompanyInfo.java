package Day01_Class_Object_Method;

public class Exe3_CompanyInfo {
private void companyName() {
System.out.println("HCL");	
}

private void companyId() {
System.out.println("61817817");	
}


private void companyAddress() {
System.out.println("chennai-600097,thoraipakkma");
}
public static void main(String[] args) {
	Exe3_CompanyInfo c =new Exe3_CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();
}
}
