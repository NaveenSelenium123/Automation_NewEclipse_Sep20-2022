package com.lao.json_path_with_java;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import static com.jayway.jsonpath.Criteria.where;
import static com.jayway.jsonpath.Filter.filter;
import static com.jayway.jsonpath.JsonPath.parse;

public class FilterPredicateExample {
	File jsonFile=new File("src/test/resources/bookstore.json");
public void filterAPIPredicateExample() throws IOException {
	
	Filter priceLessThanTen =Filter.filter(
			Criteria
			.where("price")
			.lt(10));
	List<Object> result =JsonPath
			.parse(jsonFile)
			.read("$.store.book[?]",priceLessThanTen);
	System.out.println(result);
}
public void secondFilter() throws IOException {
	Filter secondCriteria =Filter.filter(
			Criteria
			.where("price")
			.lt(10)
			.and("category")
			.is("fiction")
			);
	List<Map<String,Object>> result1 =JsonPath
			.parse(jsonFile)
			.read("$.store.book[?]",secondCriteria);
	//System.out.println(result1);
	System.out.println(result1.get(0).get("author"));
}	
public void thirdFilter() throws IOException {
	Filter thirdFilter=filter(
			where("price")
			.gt(10)
			.and("category")
			.is("fiction")
			);
	List<Map<String,Object>> result1 =parse(jsonFile)
			.read("$.store.book[?]",thirdFilter);
	System.out.println(result1);
	
}
public static void main(String[] args) throws IOException {
	FilterPredicateExample example =new FilterPredicateExample();
	//example.filterAPIPredicateExample();
	//example.secondFilter();
	example.thirdFilter();
}
}
