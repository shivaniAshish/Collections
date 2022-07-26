package com.iq.HasARelationship;

import java.util.ArrayList;

public class EmployeListTest {
	public static void main(String[] args) {
		Address address1=new Address("LB Nager", "HYD");
		Address address2=new Address("Kukatpally", "HYD");
		Employee emp1=new Employee(2001, "Karuna",50000.00, address1,address2);
		Employee emp2=new Employee(2002, "Kalyan", 65000.00, address1, address2);
		ArrayList< Object> arrayList=new ArrayList<Object>();
		arrayList.add(emp1);
		arrayList.add(emp2);
		for (Object object : arrayList) {
			System.out.println(object);
		}
	}

}
