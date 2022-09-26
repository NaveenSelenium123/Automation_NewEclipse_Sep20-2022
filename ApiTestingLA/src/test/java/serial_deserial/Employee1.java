package serial_deserial;
import java.util.Arrays;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Employee1 extends Employee {
	ObjectMapper mapper=new ObjectMapper();
	String employeeJson;
	public void serialize() throws JsonProcessingException {
		Employee employee1=new Employee();
		employee1.setFirstName("Agni");
		employee1.setLastName("A");
		employee1.setEmail("naveen.jan9@gmail.com");
		employee1.setSkills(Arrays.asList("java","selenium"));
	employeeJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
	System.out.println(employeeJson);

	}
	public void deserialize() throws JsonMappingException, JsonProcessingException {
		String employeeJson="{\r\n" + 
				"  \"lastName\" : \"A\",\r\n" + 
				"  \"skills\" : [ \"java\", \"selenium\" ],\r\n" + 
				"  \"email\" : \"naveen.jan9@gmail.com\",\r\n" + 
				"  \"firstName\" : \"Agni\"\r\n" + 
				"}";
		Employee obj=mapper.readValue(employeeJson,Employee.class);
				System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getEmail());
		System.out.println(obj.getSkills());
	}
public  static void main(String[] args) throws JsonProcessingException {
	Employee1 n =new Employee1();
	//n.serialize();
n.deserialize();
}
}
