package com.iq.vector;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector vector=new Vector();
	
//	Adding elements using add() metod of List
		vector.add(478436);
		vector.add("Sam");
		vector.add('A');
		vector.add(null);
//  Adding elements using addElement() method of Vector  
		vector.addElement("Kiran");
		vector.addElement("Sam");
		vector.add(5453181);
		vector.addElement(null);
		System.out.println(vector);
		
	}

}
