package com.javainterviewprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String a[] = { "Java", "Javascript", "c", "C++", "java","Java8","Java" };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equalsIgnoreCase(a[j])) {
					System.out.println("The Duplicate element is ==>" + a[i]);
				}
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		// Set does not allows duplicates elements
		Set<String> hs = new HashSet<String>();
		
		for(String s:a){
			if(hs.add(s)==false){
			System.out.println("The Duplicate element is ==>" + s);
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		
	}
}
