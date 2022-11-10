package Day03_Polymorphism_Abstraction;

public class PhoneExe4 {
private void phoneInfo(String s) {
	System.out.println(s);

}

private void phoneInfo(int i) {
	System.out.println(i);	

}


private void phoneInfo(String d,int pincode) {
	System.out.println(d + "\n" +pincode);	

}
public static void main(String[] args) {
	PhoneExe4 a=new PhoneExe4();
	a.phoneInfo(2322);
	a.phoneInfo("REDMI");
	a.phoneInfo("Chennai",600098);
}


}
