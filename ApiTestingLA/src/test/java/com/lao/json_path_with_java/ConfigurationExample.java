package com.lao.json_path_with_java;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class ConfigurationExample {
public static void main(String[] args) {
	String Json="[{\r\n" + 
			"    \"City\": \"Hyderabad\",\r\n" + 
			"    \"Temperature\": \"25.51 Degree celsius\",\r\n" + 
			"    \"Humidity\": \"94 Percent\",\r\n" + 
			"    \"Weather Description\": \"mist\",\r\n" + 
			"    \"Wind Speed\": \"1 Km per hour\",\r\n" + 
			"    \"Wind Direction degree\": \" Degree\"\r\n" + 
			
			"}]";
	Configuration configuration =Configuration.defaultConfiguration();
	configuration=configuration.addOptions(Option.REQUIRE_PROPERTIES);
	//configuration=configuration.addOptions(Option.AS_PATH_LIST);
	//configuration=configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);
	
	//configuration=configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
	//Configuration configuration=Configuration.builder()
		//	.options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();
	List<String> result=JsonPath.using(configuration).parse(Json).read("$.[*].City");
	
	System.out.println(result);
}
}
