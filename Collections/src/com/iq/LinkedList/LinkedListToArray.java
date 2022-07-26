package com.iq.LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LinkedListToArray {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Java");
		linkedList.add("C");
		linkedList.add("C");
		linkedList.add("C++");
		linkedList.add("Css");
		linkedList.add("Html");
		
		List<String> list=new ArrayList<String>(linkedList);
		
		for(String string:list) {
			System.out.print(string+" ");
		}
	}
	

}
