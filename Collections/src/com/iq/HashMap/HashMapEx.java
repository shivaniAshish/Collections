package com.iq.HashMap;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
//	No Methods Synchronized and hence hashmap object is not thread safe	
		HashMap<String, Double> hashMap=new HashMap<String, Double>();
		hashMap.putIfAbsent("Orange", 60.00);
		hashMap.put("Mango", 120.00);
		hashMap.put("Apple", null);
		hashMap.put(null, null);
		hashMap.put(null, null);
		hashMap.put("banana", 40.00);
		hashMap.remove("banana");
//		hashMap.remove("banana", 40.00);
		for (HashMap.Entry m : hashMap.entrySet()) {
			System.out.println("Key: "+m.getKey()+" "+"Value: "+m.getValue());
		}
	}

}
