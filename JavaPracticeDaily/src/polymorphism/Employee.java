package polymorphism;
public class Employee {
public  void empDetail(String name) {
	System.out.println(name);

}

public  void empDetail(int i) {
	System.out.println(i);	

}

public  void empDetail(int i,char c,float f) {
	System.out.println(i + "\n" + c);	
	System.out.println(f);	

}
public  void empDetail(String city,int pincode) {
	
	System.out.println(city +"\t" +pincode);
}

public  void empDetail(int pincode,String city) {
	
	System.out.println(pincode +"\t" + city);
}
public static void main(String[] args) {
	 Employee v=new  Employee();
	 v.empDetail("bala");
	 v.empDetail(382829);
	 v.empDetail(741,'M' ,85.55f);
	 v.empDetail("chennai",7387387);
	 v.empDetail(63387, "salem");
}
}
