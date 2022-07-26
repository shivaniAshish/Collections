package com.iq.ShiftPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafeEx {
	public static void main(String[] args) {
		CopyOnWriteArraySet<Object> arrayset=new CopyOnWriteArraySet<Object>();
		arrayset.add("raghu");
		arrayset.add("kamal");
		arrayset.add("shirish");
		arrayset.add("santhosh");
		Iterator aitr=arrayset.iterator();
		while(aitr.hasNext()) {
			arrayset.add("Ramya");
			System.out.println(aitr.next());
		}
		System.out.println(arrayset);
	}	

}
