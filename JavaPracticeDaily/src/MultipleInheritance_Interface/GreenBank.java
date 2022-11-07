package MultipleInheritance_Interface;

public class GreenBank implements ICICIBank,AxisBank {

	@Override
	public void fixed() {
	System.out.println("12%");
	}

	@Override
	public void current() {
		System.out.println("15%");	
	}

	@Override
	public void saving() {
		System.out.println("10%");	
	}

	@Override
	public void deposit() {
		System.out.println("2%");
	}
	public static void main(String[] args) {
		GreenBank a =new GreenBank();
		a.current();
		a.deposit();
		a.saving();
		a.fixed();
	}

}
