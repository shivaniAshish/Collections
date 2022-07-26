package com.iq.LinkendHashMap;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class LinkendHashMapEx {
	public static void main(String[] args) {
//The underlying data structure is a 
//	combination of Hash table+ LinkedList.
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
//Insertion order is preserved
		linkedHashMap.put("Sam", 101);
		linkedHashMap.put("Sam", 101);
		linkedHashMap.put("Ram", 102);
		linkedHashMap.put(null, 102);
		linkedHashMap.put("Vamsi", 103);
		linkedHashMap.put("Arun", 104);
		linkedHashMap.put(null, null);
		linkedHashMap.put(null, null);
		for (Entry<String, Integer> e : linkedHashMap.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
