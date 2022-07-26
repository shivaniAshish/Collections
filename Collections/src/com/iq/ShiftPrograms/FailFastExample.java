package com.iq.ShiftPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FailFastExample {
	public static void main(String[] args) {
		Set<Object> set=new HashSet<Object>();
		set.add("raghu");
		set.add("kamal");
		set.add("shirish");
		set.add("santhosh");
		for (Object object : set) {
			set.add("vimal");
			System.out.println(object);
			
		}
	}
}
