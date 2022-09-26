package com.lao.json_path_with_java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadingJsonDocument2 {
public static void fluentAPI() throws IOException {
File jsonFile=new File("src/test/resources/bookstore.json");
DocumentContext context = JsonPath.parse(jsonFile);
List<Object> categoryList = context.read("$..category");
for (Object category : categoryList) {
	System.out.println(category);
}
Configuration configuration=Configuration.defaultConfiguration();
JsonPath.using(configuration).parse("$..category");
}
public static void main(String[] args) throws IOException {
	fluentAPI();
}
}
