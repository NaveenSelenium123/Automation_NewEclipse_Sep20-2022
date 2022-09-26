package serial_deserial;
import java.util.List;
public class Employee {
private String FirstName;
private String LastName;
private String Email;
private List Skills;
public String getFirstName() {
	System.out.println("GETTER" + FirstName);
	return FirstName;
}
public void setFirstName(String firstName) {
	System.out.println("SETTER" + FirstName);
	FirstName = firstName;
}
public String getLastName() {
	System.out.println("GETTER " + LastName);
	return LastName;
}
public void setLastName(String lastName) {
	System.out.println("SETTER" + LastName);
	LastName = lastName;
}
public String getEmail() {
	System.out.println("GETTER" + Email);
	return Email;
}
public void setEmail(String email) {
	System.out.println("SETTER" + Email);
	Email = email;
}
public List getSkills() {
	System.out.println("GETTER" + Skills);
	return Skills;
}
public void setSkills(List skills) {
	System.out.println("SETTER" + Skills);
	Skills = skills;
}
}
