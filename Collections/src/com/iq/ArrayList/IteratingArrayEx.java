package com.iq.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayEx {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add("SAM");
		arrayList.add("Vamshi");
		arrayList.add("Karuna");
		arrayList.add("Sony");
		arrayList.add("Prakash");
		arrayList.add(7461);
		arrayList.add("null");
		//Iterating the ArrayList
		for(Object object :arrayList) {
			System.out.println(object);
		}
//		Iterator itr=arrayList.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.print(itr.next()+" ");  
//		  } 
//		  
	}

}
