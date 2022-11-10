package Day01_Class_Object_Method;
public class Exe10_Transformation {
public void transport() {
	System.out.println("Transport is need and safety");
}
public static void main(String[] args) {
	Exe10_Transformation a =new Exe10_Transformation();
	a.transport();
	Exe10_Road b =new Exe10_Road();
	b.bike();
	b.cycle();
	b.bus();
	b.car();
	
	Exe10_Air c =new Exe10_Air();
	c.aeroPlane();
	c.heliCopter();
	
	Exe10_Water d =new Exe10_Water();
	d.boat();
	d.ship();
}
}
