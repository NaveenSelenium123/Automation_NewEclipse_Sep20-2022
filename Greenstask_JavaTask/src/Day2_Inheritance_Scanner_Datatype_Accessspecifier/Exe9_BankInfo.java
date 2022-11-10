package Day2_Inheritance_Scanner_Datatype_Accessspecifier;

public class Exe9_BankInfo extends  Exe9_AxisBank {
	public void saving() {
	System.out.println("Saving Account");
}


	public void fixed() {

System.out.println("Fixed deposit");
}
	public static void main(String[] args) {
		 Exe9_BankInfo e =new  Exe9_BankInfo();
		 e.saving();
		 e.fixed();
		 e.deposit();
	}
}
