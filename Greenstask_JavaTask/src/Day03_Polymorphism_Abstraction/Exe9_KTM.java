package Day03_Polymorphism_Abstraction;

public class Exe9_KTM implements Exe9_Bike {


@Override
public void cost() {
	System.out.println("The cost of bike is" +760000);
	
}

@Override
public void speed() {
	
	System.out.println("The speed of bike" +"80kmph");
}
public static void main(String[] args) {
	Exe9_KTM v =new Exe9_KTM();
	v.cost();
	v.speed();
}
}
