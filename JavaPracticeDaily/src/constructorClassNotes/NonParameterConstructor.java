package constructorClassNotes;

public class NonParameterConstructor {
	public NonParameterConstructor() {
		System.out.println("Default consructor");
	}
	
	public NonParameterConstructor(int id) {
		System.out.println("Int para consructor-----" +id);
	}
	
	public NonParameterConstructor(String s) {
		System.out.println("Default consructor------" +s);
	}
	
	public static void main(String[] args) {
		NonParameterConstructor c=new NonParameterConstructor();
		NonParameterConstructor c1=new NonParameterConstructor(100);
		NonParameterConstructor c2=new NonParameterConstructor("Java");
	}
	
}
