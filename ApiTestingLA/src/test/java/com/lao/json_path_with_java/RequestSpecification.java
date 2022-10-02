//package com.lao.json_path_with_java;
//
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//import io.restassured.RestAssured;
//import io.restassured.http.Method;
//import io.restassured.response.Response;
//import static io.restassured.RestAssured.*;
//
//
//import static io.restassured.RestAssured.given;
//
//import io.restassured.specification.RequestSpecification;
//public class RequestSpecification {
//	
//	RequestSpecification requestSpecification;
//	
//	@BeforeSuite
//	public void setRequestSpecification() {
//		requestSpecification=given()
//		.baseUri("http://localhost:3000")
//		.basePath("/employees");
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
