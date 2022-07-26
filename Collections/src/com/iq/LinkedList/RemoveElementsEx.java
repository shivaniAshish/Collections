package com.iq.LinkedList;

import java.util.LinkedList;

public class RemoveElementsEx {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Durga Rao");
		linkedList.add("Kruna");
		linkedList.add("Kalpana");
		linkedList.add("Vishva");
		linkedList.add("Mamatha");
		//linkedList.contains(linkedList);
		//linkedList.containsAll(linkedList);
		//linkedList.clear();//it clears the list
		System.out.println(linkedList);
		linkedList.removeAll(linkedList);
		System.out.println(linkedList);
		
	}

}
