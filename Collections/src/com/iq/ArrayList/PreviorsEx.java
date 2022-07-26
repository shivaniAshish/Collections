package com.iq.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PreviorsEx {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Nithya");
		arrayList.add("Raju");
		arrayList.add("Sai");
		arrayList.add("Shiva");
		arrayList.add("Mohan");
		System.out.println("ForWard");
		ListIterator<String> iterator= arrayList.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		 System.out.println("BackWard");
		 while(iterator.hasPrevious()) {
			 System.out.print(iterator.previous()+ " ");
		 }
		System.out.println();
		
	}

}
