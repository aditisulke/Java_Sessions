package com.cybage;
import java.lang.*;
import java.util.Arrays;
public class array{
	public static void main(String args[]) {
	System.out.println("Array Demo");
	
	String hobbies[]=new String[5];
	hobbies[0]="swimming ";
	hobbies[1]="running";
	hobbies[2]="cycling";
	hobbies[3]="yoga ";
	hobbies[4]="reading ";
	
	String skills[]= {"java", "spring", "angular"};
	int score[]= {10,20,30,40,50};
	
	for(int i=-0; i<hobbies.length; i++) {
		System.out.println("  "+hobbies[i]);
	}
	
	//create temporary variable for traversing purpose (s)
	for(String s:skills) {
		System.out.println(s);
	}

	System.out.println("-------------");
	for(int s:score) {
		if(s>30) {
		System.out.println(s);}
	}
	
	
	System.out.println("-------Sorting------");
	Arrays.sort(score);{
	for(int s:score) {
		System.out.println(s);}
	}
	
	
	System.out.println("--------Searching-------");
		int pos=Arrays.binarySearch(score, 234);
		System.out.println("Position: "+pos);
	
	
	
		System.out.println("-------Copy-------");
	int copyOfScore[]=Arrays.copyOfRange(score, 2,5);
	for(int s:copyOfScore) {
		System.out.print(" "+s);
	}

	}
}