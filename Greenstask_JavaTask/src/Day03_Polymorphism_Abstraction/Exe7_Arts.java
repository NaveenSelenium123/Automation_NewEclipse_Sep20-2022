package Day03_Polymorphism_Abstraction;

public class Exe7_Arts {
private void bsc() {
System.out.println("Bachelor of science");	

}

private void bEd() {
System.out.println("Bachelor of education");	
}

private void bA() {
System.out.println("Bachelor of arts");

}

private void bBA() {
	
System.out.println("BAchlor of business administration");
}

private void ug() {
	System.out.println("Under gradutae");

}
 
 private void pg() {
	System.out.println("post gradutae");

}
 public static void main(String[] args) {
	 Exe7_Arts a =new Exe7_Arts();
	 a.ug();
	 a.pg();
}
}
