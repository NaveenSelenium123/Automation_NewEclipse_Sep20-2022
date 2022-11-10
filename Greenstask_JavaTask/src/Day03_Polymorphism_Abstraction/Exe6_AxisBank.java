package Day03_Polymorphism_Abstraction;

public class Exe6_AxisBank extends  Exe6_BankInfo {
	private void deposit() {
		System.out.println("8000");	

	}
	public static void main(String[] args) {
		Exe6_AxisBank v =new Exe6_AxisBank();
		v.deposit();
	}
}
