package Day01_Class_Object_Method;
import Day01_Class_Object_Method.Exe9_TwoWheeler;
import Day01_Class_Object_Method.Exe9_ThreeWheeler;
import Day01_Class_Object_Method.Exe9_FourWheeler;
public class Exe9_Vehicle {
public  void vehicleNecessary() {
	System.out.println("Vehicle is importtant");
}
public static void main(String[] args) {
	Exe9_Vehicle a =new Exe9_Vehicle();
	a.vehicleNecessary();
	
	Exe9_TwoWheeler b =new Exe9_TwoWheeler();
	b.bike();
	b.cycle();
	
	Exe9_ThreeWheeler c =new Exe9_ThreeWheeler();
	c.Auto();
	
	Exe9_FourWheeler d =new Exe9_FourWheeler();
	d.car();
	d.bus();
	d.lorry();
	
}
}
