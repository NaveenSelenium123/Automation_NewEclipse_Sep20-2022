package com.ems.pojo.concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
public class Deserialization1 {
	String json=("{\r\n" + 
			"    \"fruit\": \"Apple\",\r\n" + 
			"    \"size\": \"Large\",\r\n" + 
			"    \"color\": \"Red\"\r\n" + 
			"}");
	public void usingJaywayJsonPath() {
		JacksonMappingProvider mappingProvider=new JacksonMappingProvider();
		Configuration configuration=Configuration
				.builder()
				.mappingProvider(mappingProvider)
				.build();
		fruit employee =JsonPath.using(configuration)
				.parse(json)
				.read("$",fruit.class);
		System.out.println(employee.getFruit());
		System.out.println(employee.getFruit());
		System.out.println(employee.getSize());
		System.out.println(employee.getColor());
	}
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		Deserialization1 deserialization=new Deserialization1();
		deserialization.usingJaywayJsonPath();
	}
}
