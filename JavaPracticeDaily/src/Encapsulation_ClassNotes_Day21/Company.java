package Encapsulation_ClassNotes_Day21;

public class Company {
 private int id;
 private String n;
 
public int getId() {
	return id;
}
public String getN() {
	return n;
}
public void setId(int id) {
	this.id = id;
}
public void setN(String n) {
	this.n = n;
}
 public static void main(String[] args) {
	int a=100;
	Company c=new Company();
	c.setId(100);
	c.setN("Python");
	System.out.println(c.getId());
	System.out.println(c.getN());
}
}
