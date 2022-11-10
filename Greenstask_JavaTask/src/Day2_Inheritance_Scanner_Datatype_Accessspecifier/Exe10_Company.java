package Day2_Inheritance_Scanner_Datatype_Accessspecifier;

public class Exe10_Company extends  Exe10_Client{
	public void companyName() {
	System.out.println("TCS");

}
	public static void main(String[] args) {
		Exe10_Company b =new Exe10_Company();
		b.companyName();
		b.clientName();
	}
}
