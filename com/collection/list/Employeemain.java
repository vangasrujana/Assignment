package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employeemain {
	public static void main(String[] args) {
		List<Employee> arraylist=Arrays.asList(
											new Employee("raghu",1,"hyderabad"),
											new Employee("rukku",2,"banglore"),
											new Employee("chinni",3,"hyderabad"),
											new Employee("priya",4,"hyderabad"),
											new Employee("chitti",5,"mumbai"));
				
		for(Employee list:arraylist)
			System.out.println(list);
		System.out.println("---employees belongs to same city----");
		
		List<String> sameCity=new ArrayList<>();
		for(Employee emp:arraylist) {
			if(emp.getCity().equals("hyderabad")) {
				sameCity.add(emp.getName());
			}
		}
		for(String city:sameCity)
			System.out.println(city);
		
	}
	

}
