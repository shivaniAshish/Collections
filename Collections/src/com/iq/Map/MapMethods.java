package com.iq.Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
	public static void main(String[] args) {
		Map<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1001, "Kamal");
		map1.put(1003, "Ravi");
		map1.put(1002, "Sanvi");
		map1.put(1004, "Pushpa");
//		System.out.println( map1.getkey());
//		System.out.println( map1.getvalue());
		System.out.println(map1.entrySet());
		Map<Integer, String> map2=new HashMap<Integer, String>();
		map2.putAll(map1);
		System.out.println(map2.get(1001));
		
		map2.put(1005, "Kiran");
		 for(Map.Entry m:map1.entrySet()){  
			   System.out.println("Id: "+m.getKey()+" "+"Name: "+m.getValue());  
			  } 
		 }
		
}
