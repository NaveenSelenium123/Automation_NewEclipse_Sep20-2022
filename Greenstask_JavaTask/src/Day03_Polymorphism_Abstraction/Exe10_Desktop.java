package Day03_Polymorphism_Abstraction;

public class Exe10_Desktop implements Exe10_Hardware,Exe10_Software {

	@Override
	public void softwareResources() {
	
		System.out.println("windows 11 updated");
	}

	@Override
	public void hardwareResources() {
		
		System.out.println("cpu and keyboard");
	}

	private void desktopModel() {
		System.out.println("dell inspiron model 3511");

	}
	
	public static void main(String[] args) {
		Exe10_Desktop b =new Exe10_Desktop();
		b.softwareResources();
		b.hardwareResources();
		b.desktopModel();
	}
}
