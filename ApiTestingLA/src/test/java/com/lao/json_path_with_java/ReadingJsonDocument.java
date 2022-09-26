package com.lao.json_path_with_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;      //youtube video=============Rest Assured | 30 | Json Path | Using Json path with java 

public class ReadingJsonDocument {
public static void readJson() throws IOException {
	File jsonFile=new File("src/test/resources/bookstore.json");
	List<Object>name= JsonPath.read(jsonFile,"$..price");
	
	
	for (Object Name : name) {
		System.out.println(Name);
	}
}   
public static void main(String[] args) throws IOException {
	readJson(); 	
}
}
