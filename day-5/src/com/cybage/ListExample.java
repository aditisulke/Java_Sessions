package com.cybage;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> skills = new ArrayList<>();
		
		skills.add("java");
		skills.add("angular");
		skills.add("spring");
		skills.add("spring");
		
		//adding element
		skills.add(0,"react");
		System.out.println("Before removal");
		System.out.println(skills);
		
		//removing element
		skills.remove(1);
		
		System.out.println("Search using index"+skills.get(3));
		
		System.out.println(skills);
		
		//sorting-ascending
		Collections.sort(skills);
		System.out.println("After sorting"+skills);
		
		//sorting-descending
		Collections.sort(skills, Collections.reverseOrder());
		System.out.println("after sorting"+skills);
	}

}
