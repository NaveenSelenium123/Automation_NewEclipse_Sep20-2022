package Day01_Class_Object_Method;

public class Exe4_PhoneInfo {
private void phoneName() {
	System.out.println("Redmi");
}

private void phoneMIEINum() {
	System.out.println("749279279289");
}

private void camera() {
System.out.println("15.8 pixels");
}
private void storage() {
System.out.println("8 GB RAM AND 128 HARD DISK");
}
private void osName() {
	System.out.println("Android Studio");
}
public static void main(String[] args) {
	Exe4_PhoneInfo m =new Exe4_PhoneInfo();
	m.phoneName();
	m.phoneMIEINum();
	m.camera();
	m.storage();
	m.osName();
}
}
