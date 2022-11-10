package Day2_Inheritance_Scanner_Datatype_Accessspecifier;

public class Exe5_College extends Exe5_Student {
	public void collegeName() {
	
System.out.println("VIT");
}

	public void collegeCode() {
	
System.out.println("566777");
}


	public void collegeRank() {
	System.out.println("178");

}
	public static void main(String[] args) {
		Exe5_College  n =new Exe5_College ();
		n.collegeCode();
		n.collegeName();
		n.collegeRank();
		n.studentDept();
		n.studentId();
		n.hostelName();
		n.deptName();
	}
}
