package Day2_Inheritance_Scanner_Datatype_Accessspecifier;
public class Exe11_Education extends Exe11_Arts{
	public void ug() {
	System.out.println("Under graduate");
}
	public void pg() {
		System.out.println("Post graduate");
}
	public static void main(String[] args) {
		Exe11_Education g =new Exe11_Education();
		g.ug();
		g.pg();
		g.bsc();
		g.bEd();
		g.bA();
		g.bBA();
		g.bE();
		g.bTech();
		g.physiyo();
		g.dental();
		g.mbbs();
	}
}
