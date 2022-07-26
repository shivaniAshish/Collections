package com.iq.ArrayList;

import java.util.ArrayList;
import java.util.TreeMap;

public class AddAllElements {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList();
		arrayList.add("Ramu");
		arrayList.add("Vamshi");
		arrayList.add("Kalyani");
		arrayList.add("Shiva");
		ArrayList arrayList2=new ArrayList();
		arrayList2.add("Kapil");
		arrayList2.addAll(arrayList);
		//arrayList2.removeAll(arrayList);
		System.out.println(arrayList2);
	}
}
