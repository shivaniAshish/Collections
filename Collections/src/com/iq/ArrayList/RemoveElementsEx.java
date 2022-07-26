package com.iq.ArrayList;

import java.util.ArrayList;

public class RemoveElementsEx {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add("raju");
		arrayList.add("Varmaa");
		arrayList.add("Prakash");
		arrayList.add(10293);
		arrayList.add("Arun");
		System.out.println("Before Remove the Elements: "+arrayList);
		arrayList.remove(2);
		System.out.println("After Removing the Elements: "+arrayList);
		arrayList.remove("raju");
		System.out.println("After Removing the Elements: "+arrayList);
	}

}
