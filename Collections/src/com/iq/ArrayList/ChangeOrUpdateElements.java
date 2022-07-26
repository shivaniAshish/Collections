package com.iq.ArrayList;

import java.util.ArrayList;

public class ChangeOrUpdateElements {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add("SAM");
		arrayList.add(1091);
		arrayList.add(350000.00);
		arrayList.add("CGI");
		System.out.println("Before Update the elements: "+arrayList);
		arrayList.set(0, "RAM");
		System.out.println("After Update the elements: "+arrayList);
		
	}

}
