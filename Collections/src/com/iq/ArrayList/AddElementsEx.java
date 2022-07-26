package com.iq.ArrayList;

import java.util.ArrayList;

public class AddElementsEx {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
//		The underlying data structure is growable array
		arrayList.add("Sam");
		arrayList.add("Sam");
//		Duplicate objects are allowed
		arrayList.add("52178");
//		Insertion order preserved
		arrayList.add(50000.00);
		arrayList.add(null);
//		Null Insertion is possible
		arrayList.add('c');
		arrayList.add("ghfgh");
//		Heterogeneous objects are allowed
//		If our frequent operation is retrieval
//      then ArraList is the best choice,because it implements the
//		RandomAccess interface so we can get every element in the
//		array with same speed
		for(Object object:arrayList) {
			System.out.println(object);
		}
		
	}

}
