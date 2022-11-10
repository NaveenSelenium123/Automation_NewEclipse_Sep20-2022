package Day03_Polymorphism_Abstraction;

public class CompanyInfoExe3 {
	
	public void CompanyName(int g,String k) {
	System.out.println(g + "\n" +k);
	}
	
	public void CompanyName(int i) {
		System.out.println(i);
	}
	
	public void CompanyName(String s,int i) {
	System.out.println(s+"\n" +i);	
	}
	
	
	
public static void main(String[] args) {
	CompanyInfoExe3 a=new CompanyInfoExe3();
	a.CompanyName(21029);
	a.CompanyName(12121,"Anna univ");
	a.CompanyName("Anna univ", 29919);
}
}
