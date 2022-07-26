package com.iq.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayyList {
	public static void main(String[] args) {
	StudentEx std1=new StudentEx(2006, "Sam", "Bsc");
	StudentEx std2=new StudentEx(2001, "Vam", "Bcom");
	StudentEx std3=new StudentEx(2002, "Ram", "Btbc");
	StudentEx std4=new StudentEx(2005, "Shiva", "Bsc");
	ArrayList arrayList=new ArrayList();
	arrayList.add(std1);
	arrayList.add(std2);
	arrayList.add(std3);
	arrayList.add(std4);
	Collections.sort(arrayList);
	for (Object object : arrayList) {
		System.out.println(object);
	}
	
	}
}
