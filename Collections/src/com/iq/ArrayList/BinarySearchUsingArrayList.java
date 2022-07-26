package com.iq.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchUsingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(3564);
		arrayList.add(5368);
		arrayList.add(517672);
		arrayList.add(2874);
		arrayList.add(5475627);
		System.out.println(Collections.binarySearch(arrayList, 517672));
			
//		ArrayList<String> arrayList=new ArrayList<String>();
//		arrayList.add("Sam");
//		arrayList.add("Ram");
//		arrayList.add("Kamal");
//		arrayList.add("Krishna");
//		arrayList.add("Prakash");
//		System.out.println(Collections.binarySearch(arrayList, "Prakash"));
	}
		
	

}
