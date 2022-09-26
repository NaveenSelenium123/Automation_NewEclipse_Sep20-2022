package com.ems.pojo.concepts;

import java.util.Arrays;

public class Employee1 {
public static void main(String[] args) {
	Employee employee1 =new Employee();
	employee1.setFirstName("Naveen");
	employee1.setLastName("Kumar");
	employee1.setEmail("naveen.jan92f@gmail.com");
	employee1.setSkills("selenoim");
	System.out.println(employee1.getFirstName());
	System.out.println(employee1.getLastName());
	System.out.println(employee1.getSkills());
	System.out.println(employee1.getEmail());
}
}
