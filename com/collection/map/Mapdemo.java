package com.collection.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapdemo {
	 public static void main(String[] args) {
	        Map<String, List<String>> stateCities = new HashMap<>();

	  
	        List<String> city1 = new ArrayList<>();
	        city1.add("bangalore");
	        city1.add("ooty");
	        stateCities.put("State1", city1);

	        List<String> city2 = new ArrayList<>();
	        city2.add("chennai");
	        city2.add("coimbatore");
	        stateCities.put("State2", city2);

	        List<String> city3 = new ArrayList<>();
	        city3.add("goa");
	        city3.add("hyderabad");
	        stateCities.put("State3", city3);

	        for (Map.Entry<String, List<String>> entry : stateCities.entrySet()) {
	            String state = entry.getKey();
	            List<String> cities = entry.getValue();
	            System.out.println("State: " + state);
	            System.out.println("Cities: " + cities);
	        }
	    }
	

}
