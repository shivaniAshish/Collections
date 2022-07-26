package com.iq.Generies;

import java.util.ArrayList;

import com.iq.ArrayList.IntergersEx;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add("Java");
		arrayList.add(30);
		for (Object object : arrayList) {
			System.out.println(object);
		}
		arrayList.add("Sam");
		System.out.println(arrayList.get(4));

	}
}
