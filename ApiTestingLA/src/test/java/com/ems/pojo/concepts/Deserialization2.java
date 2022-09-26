package com.ems.pojo.concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.github.fge.jsonschema.main.cli.Main;

import io.restassured.path.json.JsonPath;

public class Deserialization2 {
	String json=("{\r\n" + 
			"    \"fruit\": \"Apple\",\r\n" + 
			"    \"size\": \"Large\",\r\n" + 
			"    \"color\": \"Red\"\r\n" + 
			"}");
	
	public void usingRAJsonPath() {
		
	JsonPath jsonPath = io.restassured.path.json.JsonPath.from(json);
	fruit employee	=jsonPath.getObject("$",fruit.class);
		System.out.println(employee.getFruit());
	System.out.println(employee.getSize());
	System.out.println(employee.getColor());
	}
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		Deserialization2 deserialization=new Deserialization2();
		deserialization.usingRAJsonPath();
	}
}
