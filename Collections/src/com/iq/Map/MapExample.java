package com.iq.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
// If We Want to represent the group of objects as "Key Value"
//	pair then we should go for Map Interface
// Both Key and Values are Objects Only
		map.put("Sam", 1001);//Each key value pair is calles "ONE ENTTY"
		map.put("Varun", 1003);
		map.put("Kiran", 1002);
//	Duplicate keys are not allowed but values can Duplicated
		map.put("Sam", 1001);
		map.put("Kiran", 1004);
		map.put(null, null);
		map.put(null, null);
//		System.out.println(map);
		for (String Map :map.keySet() ) {
			System.out.println("Key: "+Map+" "+"Values: "+map.get(Map));
		}
	}

}
