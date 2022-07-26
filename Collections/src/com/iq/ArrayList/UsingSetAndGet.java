package com.iq.ArrayList;

import java.util.ArrayList;

public class UsingSetAndGet {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList .add("Orange");
		arrayList .add("Apple");
		arrayList .add("Banana");
		arrayList .add("Pineapple");
		arrayList.add("WaterMilon");
		System.out.println(arrayList);
		arrayList.set(2, "3225");
		System.out.println(arrayList);
		System.out.println(arrayList.get(1));
	 

	     
	}

}
