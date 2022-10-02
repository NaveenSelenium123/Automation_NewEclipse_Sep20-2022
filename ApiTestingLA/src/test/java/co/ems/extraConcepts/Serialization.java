package co.ems.extraConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class Serialization {
	@Test
	public void Serial() {
	Map<String,Object> jsonBody =new HashMap<String,Object>();
	List<String> skills =new ArrayList<String>();
	skills.add("javaA");
	skills.add("seleniumA");
	jsonBody.put("first name","AgniA");
	jsonBody.put("last name","AA");
	jsonBody.put("email","naveenA.jan9@gmail.com");
	jsonBody.put("skills",skills);
	System.out.println(jsonBody);
	RestAssured
	 .given()
	.baseUri("http://localhost:3000")
	.header("Content-Type","application/json")
	.body(jsonBody)
	.log()
	.all()
	.when()
	.post("/employees")
	.then()
	.log()
	.all();	
	}

}
