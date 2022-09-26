package com.ems.pojo.concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

public class Deserialization {
String json=("{\r\n" + 
		"    \"fruit\": \"Apple\",\r\n" + 
		"    \"size\": \"Large\",\r\n" + 
		"    \"color\": \"Red\"\r\n" + 
		"}");
public void usingObjectMapper() throws JsonMappingException, JsonProcessingException {
	ObjectMapper mapper =new ObjectMapper();
	fruit employee=mapper.readValue(json,fruit.class);
//	System.out.println(employee.getFirstName());
//	System.out.println(employee.getLastName());
//	System.out.println(employee.getSkills());
//	System.out.println(employee.getEmail());
	System.out.println(employee.getFruit());
	System.out.println(employee.getSize());
	System.out.println(employee.getColor());
}
//public void usingJaywayJsonPath() {
//	JacksonMappingProvider mappingProvider=new JacksonMappingProvider();
//	Configuration configuration=Configuration
//			.builder()
//			.mappingProvider(mappingProvider)
//			.build();
//	fruit employee =JsonPath.using(configuration)
//			.parse(json)
//			.read("$",fruit.class);
//	System.out.println(employee.getFruit());
//	System.out.println(employee.getSize());
//	System.out.println(employee.getColor());
//}

public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	Deserialization deserialization=new Deserialization();
	deserialization.usingObjectMapper();
}
}
