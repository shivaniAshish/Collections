package com.iq.LinkedList;

import java.util.LinkedList;

public class SetAndGetElementsEx {
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.add("Ram");
		linkedList.add("Vamshi");
		linkedList.add("Kamala");
		linkedList.add("Ramesh");
		linkedList.add("Prakash");
		linkedList.add("Karunakar");
		linkedList.add(246445);
		linkedList.add(null);
		linkedList.add('h');
		System.out.println(linkedList);
		linkedList.set(0, "Rama Krishna");
//		System.out.println(linkedList);
//		linkedList.indexOf(linkedList);
//		System.out.println(linkedList);
//		System.out.println(linkedList.get(5));
//		System.out.println(linkedList.getFirst());//returns the First element in the list
		System.out.println(linkedList.getLast());
		
		
		
	}

	
}
