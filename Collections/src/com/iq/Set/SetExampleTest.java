package com.iq.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetExampleTest {
	public static void main(String[] args) {
		Employeee employee1 = new Employeee(1001, "Sam", 80000.00);
		Employeee employee2 = new Employeee(1002, "Vam", 50000.00);
		Employeee employee3 = new Employeee(1003, "Kanna", 69960.00);
		Employeee employee4 = new Employeee(1004, "Vamshi", 25000.00);
		Employeee employee5 = new Employeee(1005, null, 26000.00);
		Employeee employee6 = new Employeee(1005, null, 26000.00);
		Employeee employee7 = new Employeee(1004, "Vamshi", 25000.00);
		Set<Employeee> hashSet = new HashSet<Employeee>();
		hashSet.add(employee1);
		hashSet.add(employee2);
		hashSet.add(employee3);
		hashSet.add(employee4);
		hashSet.add(employee5);
		hashSet.add(employee6);
		hashSet.add(employee7);
		hashSet.add(employee7);

		for (Employeee employee : hashSet) {
			System.out.println(employee);
		}

//		System.out.println(employee4.equals(employee7));

//		for (Employee employee: arrayList) {
//			if (employee.geteName().charAt(0) == 'K') {
//				System.out.println(employee);
//			}
//		}
//		for (Employee employee : arrayList) {
//			if(employee.getSalary()>=25000 && employee.getSalary()<80000) {
//				System.out.println(employee);
//			}
//			
//		}
//		for (Employee employee : arrayList) {
//			if(employee.getSalary()>=25000 && employee.getSalary()<=25000) {
//				System.out.println(employee);
//			}
//			
//		}
//		for (Employee employee : arrayList) {
//			if(employee.getSalary()>=80000 && employee.getSalary()<=80000) {
//				System.out.println(employee);
//			}
//			
	}
}
