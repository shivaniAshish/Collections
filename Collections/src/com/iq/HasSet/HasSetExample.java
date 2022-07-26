package com.iq.HasSet;

import java.util.HashSet;

public class HasSetExample {
	public static void main(String[] args) {
		HashSet<Object> hashSet=new HashSet<Object>();
//		The underlying data structure is Hashtable
		hashSet.add("Sam");
		hashSet.add("1001");
		hashSet.add("MBA");
//		Insertion order is not preserved 
//		and it is based on hash code of the objects
		hashSet.add("Sam");
//		Duplicate objects are not allowed
//		If we are trying to insert duplicate objects 
//	    we won't get compile time error
//		and runtime error add() method simply returns false.
//		Heterogeneous objects are allowed.
		hashSet.add(null);
		hashSet.add(null);
//		Null insertion is possible.(only once)
//		HashSet is best suitable, 
//		if our frequent operation is "Search"
		for (Object object : hashSet) {
			System.out.println(object);
		}
	}
	
}
