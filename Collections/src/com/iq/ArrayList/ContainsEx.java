package com.iq.ArrayList;

import java.util.ArrayList;

public class ContainsEx {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Nithya");
		arrayList.add("Raju");
		arrayList.add("Sai");
		arrayList.add("Shiva");
		arrayList.add("Mohan");
		System.out.println(arrayList);
		if(arrayList.contains("Raju")) {
			for(int i=0;i<arrayList.size();i++) {
				if(arrayList.contains("Raju")) {
					arrayList.remove("Raju");
					arrayList.add(1, "Rajesh");
				}
			}
			System.out.println(arrayList);
//		arrayList.contains("Raju");
//		arrayList.remove("Raju");
//		arrayList.add(1, "Rajesh");
//		System.out.println(arrayList);
			
		}
	}
}

