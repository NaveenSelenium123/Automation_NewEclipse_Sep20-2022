package Day03_Polymorphism_Abstraction;

public class Exe8_University extends Exe8_College {
private void ug() {
System.out.println("under graduate");	

}

private void pg() {
	System.out.println("post graduate");	

}
public static void main(String[] args) {
	Exe8_University z =new Exe8_University();
	z.ug();
	z.pg();
}
}
