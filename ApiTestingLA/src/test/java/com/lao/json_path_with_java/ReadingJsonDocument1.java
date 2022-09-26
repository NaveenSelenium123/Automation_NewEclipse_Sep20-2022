//package com.lao.json_path_with_java;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//import com.jayway.jsonpath.Configuration;
//import com.jayway.jsonpath.JsonPath;
//
//public class ReadingJsonDocument1 {
//	public static void parseOneTime() throws FileNotFoundException {
//		InputStream jsonFile=new FileInputStream("src/test/resources/bookstore.json");
//				   Object parsedJsonDoc=Configuration
//		                      .defaultConfiguration()
//		                      .jsonProvider().parse(jsonFile.readAllBytes());
//		   List<Object>categoryList= JsonPath.read(parsedJsonDoc,"$..category");
//				
//			for (Object category : categoryList) {
//				System.out.println(category);
//			}                    
//		}
//		public static void main(String[] args) throws IOException {
//			//readJson(); 
//			parseOneTime();
//		}
//}
