package com.iq.LinkedList;

import java.util.LinkedList;

public class AddElementsEx {
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
//		The underlying data structure is double LinkedList
		linkedList.add("Ram");
//		If our frequent operation is insertion (or) 
//		deletion in the middle then LinkedList is the best choice.
//		If our frequent operation is retrieval operation then 
//		LinkedList is worst choice.
		linkedList.add("Vamshi");
//		Duplicate objects are allowed.
//		Insertion order is preserved.
//		Heterogeneous objects are allowed.
		linkedList.add(null);
//		Null insertion is possible
		linkedList.add("Vamshi");
		linkedList.add("Kamala");
		linkedList.add("Ramesh");
		linkedList.addFirst("Prakash");//add the element in the First index
		linkedList.addLast("Karunakar");//add the element in the last index
		System.out.println(linkedList);
		LinkedList linkedList2=new LinkedList();
		linkedList2.add("Vasavya");
		linkedList.addAll(linkedList2);
		linkedList.addAll(2, linkedList);
		for (Object object : linkedList2) {
			System.out.print(object+" " );
		}
		
	}

}
