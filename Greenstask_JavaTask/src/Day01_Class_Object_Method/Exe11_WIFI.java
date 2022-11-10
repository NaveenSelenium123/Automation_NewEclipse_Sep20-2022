package Day01_Class_Object_Method;

public class Exe11_WIFI {
	public  void wifiName() {
		System.out.println("Broadband");

	}
	public static void main(String[] args) {
		Exe11_WIFI a =new Exe11_WIFI();
		a.wifiName();
		Exe11_MobileData b =new Exe11_MobileData();
		b.dataName();
		
		Exe11_Lan c =new Exe11_Lan();
		c.lanName();
		
		Exe11_Wireless d =new Exe11_Wireless();
		d.modamName();
		
	}
}
