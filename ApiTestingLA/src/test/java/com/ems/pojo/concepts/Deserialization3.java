package com.ems.pojo.concepts;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.github.fge.jsonschema.main.cli.Main;
import java.util.Map;

import com.github.fge.jsonschema.main.cli.Main;

import io.restassured.common.mapper.TypeRef;
public class Deserialization3 {
	public void usingAsFunction() {
	Map<String,Object> response=
			   given()
	.baseUri("http://localhost:3000/employees")
	         .when()
	         .get("/employees/1")
	         .then()
	         .extract()
	         .body()
	         .as(new TypeRef <Map<String,Object>>(){
	          });
System.out.println(response);
System.out.println(response.get("first_name"));
}
	public static void main(String[] args) {
		Deserialization3 e=new Deserialization3();
		e.usingAsFunction();
	}
}