package com.cybage.mapexample;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;


public class MapExample {

	public static void main(String[] args) {
		
		System.out.println("Map Example");
		Map<String,String> capitals= new HashMap<>();
		
		//Map<String, Long> population =new LinkedHashMap<>();
		//Map<String, Long> population =new HashMap<>();
		//Map<String, Long> population =new TreeMap<>();
		//Map<String, Long> population =new HashTable<>();
		
		capitals.put("MH", "mumbai");
		capitals.put("GJ", "gandhinagar");
		capitals.put("TL", "hyderabad");
		capitals.put("AP", "hyderabad");
		capitals.put("TN", "chennai");
		capitals.put("PB", "chandigarh");
		capitals.put("HN", "chandigarh");
		capitals.put("MH", "pune");
		capitals.put("delhi",null);
		capitals.put("MP",null);
		
		System.out.println(capitals);
		
		//get only keys
		Set<String> state=capitals.keySet();
		System.out.println(state);
		
		//get only values
		Collection<String> capital = capitals.values();
		System.out.println(capital);
		
		
	}

}
