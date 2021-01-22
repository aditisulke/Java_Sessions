package com.cybage;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

 

public class SetExample {
    public static void main(String[] args) {
        System.out.println("set example...");
        
        /*hash-set
        Set<String> skills = new HashSet<>();*/
        
        /*Tree-set
        Set<String> skills= new TreeSet<>();*/
        
        //Linked hash-set
        Set<String> skills= new LinkedHashSet<>();
        
        
        
        //java, angular, java
        skills.add("java");
        skills.add("angular");
        skills.add("react");
        skills.add("aws");
        skills.add("angular");
        skills.add("react");
        skills.add("aws");
        
        System.out.println(skills);
        for(String s: skills) {
            System.out.println(s);
        }
        
        
        /*using iterator
        Iterator<String> sit = skills.iterator();
        while(sit.hasNext()) {
            System.out.println(sit.next());
        }*/
        
     
        
        
    }
}