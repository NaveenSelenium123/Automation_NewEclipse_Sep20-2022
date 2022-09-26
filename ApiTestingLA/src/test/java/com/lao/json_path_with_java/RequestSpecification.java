//package com.lao.json_path_with_java;
//
//import static io.restassured.RestAssured.given;
//import io.restassured.specification.RequestSpecification;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class RequestSpecification {
//	
//	RequestSpecification requestSpecification;
//	@BeforeClass
//	public void setRequestSpecification() {
//		requestSpecification=given()
//		.baseUri("http://localhost:3000").
//		basePath("/employees");
//
//	}
//	@Test
//	public void getAllEmployees() {
//		given()
//		.spec(requestSpecification)
//		.when()
//		.prettyPrint();
//	}
//	
//	@Test
//	public void getAnEmployees() {
//		given()
//		.spec(requestSpecification)
//		.when()
//		.get("/1")
//		.prettyPrint();
//	}
//}
