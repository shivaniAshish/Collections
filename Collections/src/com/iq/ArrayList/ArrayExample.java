 package com.iq.ArrayList;

public class ArrayExample {
	public static void main(String[] args) {
		 Object[] obj=new Object[8];
		 obj[0]= new Integer(5418);
		 obj[1]=new String("SAM");
		 obj[2]=new Employee(101, "shiva", 60000.00);
		 obj[3]=new Double(574841.87);
		 obj[4]=new Character('A');
		 obj[5]=new Float(3566576.00f);		 
		 System.out.println("--------------");
		 for(Object object:obj) {
			 System.out.println(object);
		 }
	}

}
