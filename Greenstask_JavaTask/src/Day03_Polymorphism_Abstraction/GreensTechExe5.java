package Day03_Polymorphism_Abstraction;

public class GreensTechExe5 {
 private void greensOmr(String name) {
	
System.out.println(name);
}
 
 
 private void greensOmr(int i) {
	 System.out.println(i);	

 }
 
 private void greensOmr(int i,String c) {
		System.out.println(i+"\n"+c);

 }
 
 
 private void greensOmr(String s ,int pincode) {
	 System.out.println(s+"\n"+pincode);

 }
 public static void main(String[] args) {
	 GreensTechExe5 a=new GreensTechExe5();
	 a.greensOmr(1);
	 a.greensOmr("Greens Tech");
	 a.greensOmr(73873839, "Selenium");
	 a.greensOmr("Chennai", 600039);
}
 
}
