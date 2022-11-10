package Day01_Class_Object_Method;
import Day01_Class_Object_Method.Exe7_InternalStorage;
public class Exe7_ExternalStorage {
	public void processorName() {
	System.out.println("Snapdram processor");
}
	public void ramSize() {
	System.out.println("128 GB Ram");
}
	public static void main(String[] args) {
		Exe7_ExternalStorage  x =new Exe7_ExternalStorage ();
		x.processorName();
		x.ramSize();
		Exe7_InternalStorage y =new Exe7_InternalStorage();
		y.size();
	}
}
